package com.xworz.comparable.external;

import com.xworz.comparable.dto.StudentDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {

        StudentDto studentDto1 = new StudentDto('A', 103, "prasad");
        StudentDto studentDto2 = new StudentDto('A', 101, "daya");
        StudentDto studentDto3 = new StudentDto('A', 102, "praveen");

        List<StudentDto> list = new ArrayList<>();
        list.add(studentDto1);
        list.add(studentDto2);
        list.add(studentDto3);

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}