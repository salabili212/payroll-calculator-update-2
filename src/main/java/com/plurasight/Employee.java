package com.plurasight;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWork;
    private double payRate;

    Employee(int id, String name, double hoursWork, double payRate){
        this.employeeId = id;
        this.name = name;
        this.hoursWork = hoursWork;
        this.payRate = payRate;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHoursWork() {
        return hoursWork;
    };

    public double getPayRate() {
        return payRate;
    }

    public double getGrossPasy(){
        return this.payRate * this.hoursWork;
    }
}