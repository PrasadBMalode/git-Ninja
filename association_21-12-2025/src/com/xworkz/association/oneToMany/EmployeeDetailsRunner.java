package com.xworkz.association.oneToMany;

public class EmployeeDetailsRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Ravi", 201);

        Company company = new Company("Infosys", "Bangalore", employee);
        Project project = new Project("Banking App", 12, employee);

        company.displayCompany();
        project.displayProject();
    }
}
