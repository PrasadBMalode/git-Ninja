package com.xworkz.trip.external;

import com.xworkz.trip.dto.StaffDto;

public class StaffRunner {
    public static void main(String[] args) {
        StaffDto staffDto=new StaffDto();
        staffDto.setStaffId(234);
        int id= staffDto.getStaffId();
        System.out.println("id=="+id);

        staffDto.setNumber(24535647);
        long num= staffDto.getNumber();
        System.out.println("number=="+num);

        staffDto.setRatings(4.5f);
        float rating= staffDto.getRatings();
        System.out.println("ratings=="+rating);

        staffDto.setType('A');
        char type=staffDto.getType();
        System.out.println("type=="+type);

        staffDto.setSalary(35.000);
        double salary=staffDto.getSalary();
        System.out.println("salary=="+salary);

        staffDto.setName("radha");
        String name= staffDto.getName();
        System.out.println("name=="+name);
    }
}
