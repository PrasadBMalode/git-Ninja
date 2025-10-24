package com.xworkz.association.internal;

public class College {
    public String colegeName;
    public String education;
    public RollNumber rollNumber;

    public College(String colegeName, String education, RollNumber rollNumber){
        this.colegeName=colegeName;
        this.education=education;
        this.rollNumber=rollNumber;
    }
    public void displayColege(){
        System.out.println("colege name="+colegeName);
        System.out.println("education=="+education);
        System.out.println("Roll Number details="+rollNumber.studentName);

    }

}
