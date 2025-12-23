package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.dto.EmployeeDto;

public class EmployeeDtoRunner {
    public static void main(String[] args) {

        EmployeeDto employeeDto1=new EmployeeDto(102,true,"Mohan",9878767546l);
        EmployeeDto employeeDto2=new EmployeeDto(103,true,"Shivu",78887767546l);
        EmployeeDto employeeDto3=new EmployeeDto(101,true,"Harish",8876767546l);
        EmployeeDto employeeDto4 =new EmployeeDto(101,true,"Harish",8876767546l);

        System.out.println(employeeDto1.toString());
        System.out.println(employeeDto2.toString());
        System.out.println(employeeDto4.toString());

       if(employeeDto1.equals(employeeDto2)){
           System.out.println("having same values");
       }else {
           System.out.println("emp 1 and emp2 are differnt values");
       }

        if (employeeDto2.isActive()) {
            System.out.println(employeeDto2.getName() + " =is an active employee");
        } else {
            System.out.println(employeeDto2.getName() + " =is not active");
        }

        System.out.println(employeeDto3.hashCode()+"= hashCode of emp3 ");
        System.out.println(employeeDto4.hashCode()+"= hashCode of emp4 ");
    }
}
