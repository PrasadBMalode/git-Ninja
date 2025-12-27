package com.xworkz.comparator.outer;

import com.xworkz.comparator.dto.EmployeeDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {
        EmployeeDto employeeDto1=new EmployeeDto("X-workz","Kumar",101);
        EmployeeDto employeeDto2=new EmployeeDto("Nimblix","prasad",103);
        EmployeeDto employeeDto3=new EmployeeDto("Finix","shivu",102);

        List<EmployeeDto> list=new ArrayList<>();
        list.add(employeeDto1);
        list.add(employeeDto2);
        list.add(employeeDto3);

        Comparator<EmployeeDto> comparator=(a,b)->a.getEmployeId()-b.getEmployeId();

        list.sort(comparator);
        list.forEach(n-> System.out.println(n));
    }
}
