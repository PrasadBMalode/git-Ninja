package com.xworkz.association.internal;

public class CollegeLibrary {
    public String libraryName;
    public RollNumber rollNumber;

    public CollegeLibrary(String libraryName, RollNumber rollNumber){
        this.libraryName=libraryName;
        this.rollNumber=rollNumber;
    }

    public void displayCollegeLibrary(){
        System.out.println("Libary name="+libraryName);
        System.out.println("Roll number details="+rollNumber.studentName);
    }
}
