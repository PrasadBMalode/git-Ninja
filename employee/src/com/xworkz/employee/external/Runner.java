package com.xworkz.employee.external;

import com.xworkz.employee.internal.Employee;

public class Runner {
    public static void main(String[] args) {
        Employee employee =new Employee();
        employee.salary(55.999);
        //employee.employee(32.999)

        employee.colleagues(3);
        //employee.colleagues(0);

        employee.work("good");
        //employee.work("bad");

        employee.experience(2.5f);
        //employee.experience(1.2f);

        employee.gf(true);
        //employee.gf(false);
    }
}
