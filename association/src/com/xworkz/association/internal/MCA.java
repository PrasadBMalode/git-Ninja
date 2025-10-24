package com.xworkz.association.internal;

public class MCA {
    public String collegeName;
    public String located;
    public HOD hod;
    public Faculty faculty;
    public Student student;

    public MCA(String collegeName, String located, HOD hod, Faculty faculty, Student student){
        this.collegeName=collegeName;
        this.located=located;
        this.hod=hod;
        this.faculty=faculty;
        this.student=student;
    }
    public void displayMCA(){
        System.out.println("college name="+collegeName);
        System.out.println("college located in="+located);
        System.out.println("HOD details="+hod.hodName);
        System.out.println("HOD details="+hod.department);
        System.out.println("Faculty details="+faculty.numberOfFaculty);
        System.out.println("Faculty details="+faculty.good);
        System.out.println("Student details="+student.studentName);
        System.out.println("Student details="+student.studntID);
    }
}
