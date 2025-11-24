package com.xworkz.collectionFirst.external;

import java.util.ArrayList;
import java.util.Collection;

public class StudentsGradeRunner {
    public static void main(String[] args) {
        Collection<Character> grade=new ArrayList<>();

        grade.add('A');
        grade.add('C');
        grade.add('B');
        System.out.println("all grades=="+grade.toString());
        System.out.println("total number of students=="+grade.size());

        grade.clear();
        System.out.println("after clearing all students grade=="+grade.size());
    }
}
