package com.xworkz.association.oneToMany;

public class Library {
    public String libraryName;
    public int noOfLybrarys;
    public Student student;

    public Library(String libraryName, int noOfLybrarys, Student student){
        this.libraryName=libraryName;
        this.noOfLybrarys=noOfLybrarys;
        this.student=student;
    }
    public void displayLibrary(){
        System.out.println("library name=="+libraryName);
        System.out.println("number of librarys=="+noOfLybrarys);
        System.out.println("Student details=="+student.studentName);
        System.out.println("Student details=="+student.studentId);
    }
}
