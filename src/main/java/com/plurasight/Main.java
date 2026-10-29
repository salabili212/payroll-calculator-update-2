package com.plurasight;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args){

        //Declear FileReader && FileWriter And BufferedReader && BufferedWriter
        FileWriter filewriter = null;
        try {

            filewriter = new FileWriter("src/main/resources/employeesSecondFile.csv");
            BufferedWriter writerbuffered = new BufferedWriter(filewriter);
            FileReader file = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(file);

            //declear a variable of the class Employee to use it and store info in it
            Employee employeeTemp;
            String employessInfo;
            String[] array;


            try {
                employessInfo = bufReader.readLine();
                writerbuffered.write(employessInfo);
                writerbuffered.newLine();
                while(employessInfo != null){
                    try {
                        employessInfo = bufReader.readLine();
                        if(employessInfo == null){
                            break;
                        }
                        array = employessInfo.split("\\|");
                        int id = Integer.parseInt(array[0]);
                        String name = array[1];
                        double hoursWork = Double.parseDouble(array[2]);
                        double payRate = Double.parseDouble(array[3]);
                        employeeTemp = new Employee(id,name,hoursWork,payRate);
                        System.out.printf("ID:%d, Name: %s, GrossPay:%f.2\n",id,name,employeeTemp.getGrossPasy());

                        //write to another file and end line and start new line
                        writerbuffered.write(employessInfo);
                        writerbuffered.newLine();
                    }catch (Exception e){
                        System.out.println("Can not read from or write to a file Line 38\n error type \n"+e);
                    }
                };
                bufReader.close();
                writerbuffered.close();

            }catch (IOException e){
                System.out.println("Can not read from or write to a file Line 45\n error type \n"+e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
