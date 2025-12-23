package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.dto.FacultyDto;

public class FacultyDtoRunner {
    public static void main(String[] args) {

        FacultyDto facultyDto=new FacultyDto();

        facultyDto.setName("Mahesh");
        String name=facultyDto.getName();
        System.out.println("Faculty name== "+name);

        facultyDto.setId(101);
        int id=facultyDto.getId();
        System.out.println("Faculty id=="+id);

        facultyDto.setNumber(6360211265l);
        long number=facultyDto.getNumber();
        System.out.println("Faculty number=="+number);

        facultyDto.setHeight(5.9f);
        float height=facultyDto.getHeight();
        System.out.println("Faculty height=="+height);
    }
}
