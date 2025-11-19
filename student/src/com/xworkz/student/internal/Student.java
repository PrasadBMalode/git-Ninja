package com.xworkz.student.internal;

import com.xworkz.student.event.*;

public class Student {
    public int studentID(int id){
        if (id==6015){
            try {
                throw new InvalidStudentIDException();
            }catch (InvalidStudentIDException invalidStudentIDException){
                invalidStudentIDException.printStackTrace();
                System.out.println("its valid id");
            }
        }else {
            System.out.println("its invalid id");
        }
        return id;
    }

    public boolean scolership(boolean bpl){
        if (bpl==false){
            try {
                throw new Non_ScolershipException();
            }catch (Non_ScolershipException nonScolershipException){
                nonScolershipException.printStackTrace();
                System.out.println("student does't have scolership");
            }
        }else {
            System.out.println("student have scolership");
        }
        return bpl;
    }

    public String cllg(String student){
        if (student=="absent"){
            try {
                throw new StudentAbsentException();
            }catch (StudentAbsentException studentAbsentException){
                studentAbsentException.printStackTrace();
                System.out.println("student is absent");
            }
        }else {
            System.out.println("student is present");
        }
        return student;
    }

    public char student(char section){
        if (section=='F'){
            try {
                throw new StudentDifferentSectionException();
            }catch (StudentDifferentSectionException studentDifferentSectionException){
                studentDifferentSectionException.printStackTrace();
                System.out.println("he/she from diff section");
            }
        }else {
            System.out.println("he/she from the same section");
        }
        return section;
    }

    public float studentMarks(float marks){
        if (marks<35.0f){
            try {
                throw new StudentFailException();
            }catch (StudentFailException studentFailException){
                studentFailException.printStackTrace();
                System.out.println("student failed in exams");
            }
        }else {
            System.out.println("student pass in exams");
        }
        return marks;
    }
}
