package com.xworkz.association.internal;

public class Scolership {
    public String schloershipName;
    public RollNumber rollNumber;

    public Scolership(String schloershipName, RollNumber rollNumber){
        this.schloershipName=schloershipName;
        this.rollNumber=rollNumber;
    }

    public void displayschloershipName(){
        System.out.println("scolership name="+schloershipName);
        System.out.println("Roll number Details="+rollNumber.studentName);
    }
}
