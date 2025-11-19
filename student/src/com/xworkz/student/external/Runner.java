package com.xworkz.student.external;

import com.xworkz.student.internal.Student;

public class Runner{
    public static void main(String[] args) {
        Student student=new Student();
        student.studentID(6015);

        student.scolership(false);

        student.cllg("absent");

        student.student('F');

        student.studentMarks(30.4f);
    }
}
