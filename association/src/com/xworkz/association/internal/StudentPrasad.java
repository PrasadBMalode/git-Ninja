package com.xworkz.association.internal;

public class StudentPrasad {
    public String studentName;
    public Java java;
    public OS os;
    public DBMS dbms;

    public StudentPrasad(String studentName, Java java, OS os, DBMS dbms){
        this.studentName=studentName;
        this.java=java;
        this.os=os;
        this.dbms=dbms;
    }
    public void displayStudentPrasad(){
        System.out.println("student name="+studentName);
        System.out.println("java total marks"+java.totalJavaMarks);
        System.out.println("Os total marks="+os.totalOSMarks);
        System.out.println("DBMS total marks="+dbms.totalDBMSMarks);
    }
}
