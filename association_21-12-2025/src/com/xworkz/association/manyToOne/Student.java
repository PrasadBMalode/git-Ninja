package com.xworkz.association.manyToOne;

public class Student {
    public String studentName;
    public int studentId;
    public College college;
    public Library library;

    public Student(String studentName, int studentId, College college, Library library){
        this.studentName=studentName;
        this.studentId=studentId;
        this.college=college;
        this.library=library;
    }
    public void displayStudent(){
        System.out.println("Student name is== "+studentName);
        System.out.println("student id=="+studentId);
        System.out.println("colleg details=="+college.cllgName);
        System.out.println("colleg details=="+college.cllgLocaton);
        System.out.println("Library details=="+library.libraryName);
        System.out.println("Library details=="+library.noOfLybrarys);

    }
}

