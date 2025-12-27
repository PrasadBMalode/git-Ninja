package com.xworkz.comparator.outer;

import com.xworkz.comparator.dto.StudentDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        StudentDto studentDto1=new StudentDto('A',103,"prasad");
        StudentDto studentDto2=new StudentDto('A',101,"daya");
        StudentDto studentDto3=new StudentDto('A',102,"praveen");

        List<StudentDto> list=new ArrayList<>();
        list.add(studentDto1);
        list.add(studentDto2);
        list.add(studentDto3);

        Comparator<StudentDto> comparator=(s1, s2)->Integer.compare(s1.getStudentId(),s2.getStudentId());

        list.sort(comparator);
        list.forEach(n-> System.out.println(n));
    }
}

