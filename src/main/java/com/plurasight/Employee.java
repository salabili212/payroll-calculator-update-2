package com.plurasight;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/main/resources/employees.csv");
        BufferedReader bufReader = new BufferedReader(file);
        Employee employeeTemp;
        String employessInfo;


        while((employessInfo = bufReader.readLine()) != null){
            String[] array;
            employessInfo = bufReader.readLine();
            array = employessInfo.split("\\|");

            int id = Integer.parseInt(array[0]);
            String name = array[1];
            double hoursWork = Double.parseDouble(array[2]);
            double payRate = Double.parseDouble(array[3]);
            employeeTemp = new Employee(id,name,hoursWork,payRate);

            System.out.printf("ID:%d, Name: %s, GrossPay:%f.2\n",id,name,employeeTemp.getGrossPasy());
            


        }
        bufReader.close();

    }
}
