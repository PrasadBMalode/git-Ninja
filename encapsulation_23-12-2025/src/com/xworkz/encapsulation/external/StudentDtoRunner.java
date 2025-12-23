package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.dto.StudentDto;

public class StudentDtoRunner {
    public static void main(String[] args) {
        StudentDto studentDto=new StudentDto();

        studentDto.setName("prasad");
        String name=studentDto.getName();
        System.out.println("student name== "+name);

        studentDto.setId(101);
        int id=studentDto.getId();
        System.out.println("student id=="+id);

        studentDto.setNumber(6360211265l);
        long number=studentDto.getNumber();
        System.out.println("student number=="+number);

        studentDto.setHeight(5.9f);
        float height=studentDto.getHeight();
        System.out.println("student height=="+height);
    }
}
