package com.xworkz.association.internal;

public class Student {
    public String studentName;
    public int studntID;

    public Student(String studentName, int studntID){
        this.studentName=studentName;
        this.studntID=studntID;
    }

    public void displayStudent(){
        System.out.println("student name="+studentName);
        System.out.println("student id="+studntID);
    }
}
