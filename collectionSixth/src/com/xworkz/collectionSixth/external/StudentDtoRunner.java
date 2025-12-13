package com.xworkz.collectionSixth.external;

import com.xworkz.collectionSixth.dto.StudentDTO;

import java.util.*;

public class StudentDtoRunner  {
    public static void main(String[] args) {

        StudentDTO studentDTO1 = new StudentDTO(101, "prasad", 6360211265L);
        StudentDTO studentDTO2 = new StudentDTO(102, "prasad", 9876567546L);
        StudentDTO studentDTO3 = new StudentDTO(103, "anil", 9123456789L);

        List<StudentDTO> list = new ArrayList<>();
        list.add(studentDTO1);
        list.add(studentDTO2);
        list.add(studentDTO3);

        list.sort((o1, o2) -> o1.getStudentName().compareTo(o2.getStudentName()));

        list.forEach(System.out::println);
    }
}
