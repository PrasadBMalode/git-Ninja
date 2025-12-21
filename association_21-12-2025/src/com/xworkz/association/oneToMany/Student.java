package com.xworkz.association.oneToMany;

public class Student {
    public String studentName;
    public int studentId;

    public Student(String studentName, int studentId){
        this.studentName=studentName;
        this.studentId=studentId;
    }
    public void displayStudent(){
        System.out.println("Student name is== "+studentName);
        System.out.println("student id=="+studentId);
    }
}
