package com.xworz.comparable.external;

import com.xworz.comparable.dto.EmployeeDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {

        EmployeeDto employeeDto1 = new EmployeeDto("X-workz", "Kumar", 101);
        EmployeeDto employeeDto2 = new EmployeeDto("Nimblix", "Prasad", 103);
        EmployeeDto employeeDto3 = new EmployeeDto("Finix", "Shivu", 102);

        List<EmployeeDto> list = new ArrayList<>();
        list.add(employeeDto1);
        list.add(employeeDto2);
        list.add(employeeDto3);

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
