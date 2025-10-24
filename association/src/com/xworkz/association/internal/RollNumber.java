package com.xworkz.association.internal;

public class RollNumber {
    public String studentName;
    public int rollNumber;

    public RollNumber(String studentName,int rollNumber){
        this.studentName=studentName;
        this.rollNumber=rollNumber;
    }

    public void displayRoleNumber(){
        System.out.println("student name="+studentName);
        System.out.println("studnet roll naumbr"+rollNumber);
    }
}
