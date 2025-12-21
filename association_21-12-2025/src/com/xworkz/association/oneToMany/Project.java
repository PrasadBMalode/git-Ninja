package com.xworkz.association.oneToMany;

public class Project {
    public String projectName;
    public int duration;
    public Employee employee;

    public Project(String projectName, int duration, Employee employee) {
        this.projectName = projectName;
        this.duration = duration;
        this.employee = employee;
    }

    public void displayProject() {
        System.out.println("Project name == " + projectName);
        System.out.println("Project duration == " + duration);
        System.out.println("Employee name == " + employee.employeeName);
        System.out.println("Employee id == " + employee.employeeId);
    }
}
