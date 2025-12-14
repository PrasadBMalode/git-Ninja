package com.xworkz.collectionSixth.external;

import com.xworkz.collectionSixth.dto.StudentDTO;

import java.util.*;

public class StudentDtoRunner {
    public static void main(String[] args) {

        StudentDTO studentDTO1 = new StudentDTO(121, "prasad", 6360211265L);
        StudentDTO studentDTO2 = new StudentDTO(283, "prasad", 9876567546L);
        StudentDTO studentDTO3 = new StudentDTO(512, "Zahil", 9123456789L);

        Comparator<StudentDTO> comparator = (s1, s2) -> ((s1.getStudentId() / 10) % 10)
                                                      - ((s2.getStudentId() / 10) % 10);
        List<StudentDTO> list = new ArrayList<>();
        list.add(studentDTO1);
        list.add(studentDTO2);
        list.add(studentDTO3);


        list.sort(comparator);
        list.forEach(n-> System.out.println(n));
    }
}
