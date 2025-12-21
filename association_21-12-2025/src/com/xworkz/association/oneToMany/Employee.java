package com.xworkz.association.oneToMany;

public class Employee {
    public String employeeName;
    public int employeeId;

    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public void displayEmployee() {
        System.out.println("Employee name == " + employeeName);
        System.out.println("Employee id == " + employeeId);
    }
}
