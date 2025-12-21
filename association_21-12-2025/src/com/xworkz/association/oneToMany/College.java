package com.xworkz.association.oneToMany;

public class College {
    public String cllgName;
    public String cllgLocaton;
    public Student student;

    public College(String cllgName, String cllgLocaton, Student student){
        this.cllgName=cllgName;
        this.cllgLocaton=cllgLocaton;
        this.student=student;
    }
    public void displayCllg(){
        System.out.println("cllg name=="+cllgName);
        System.out.println("cllg location=="+cllgLocaton);
        System.out.println("Student details=="+student.studentName);
        System.out.println("Student details=="+student.studentId);
    }
}
