package com.xworkz.association.oneToMany;

public class Company {
    public String companyName;
    public String companyLocation;
    public Employee employee;

    public Company(String companyName, String companyLocation, Employee employee) {
        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.employee = employee;
    }

    public void displayCompany() {
        System.out.println("Company name == " + companyName);
        System.out.println("Company location == " + companyLocation);
        System.out.println("Employee name == " + employee.employeeName);
        System.out.println("Employee id == " + employee.employeeId);
    }
}
