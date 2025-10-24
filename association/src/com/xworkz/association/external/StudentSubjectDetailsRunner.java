package com.xworkz.association.external;

import com.xworkz.association.internal.*;



public class StudentSubjectDetailsRunner {
    public static void main(String[] args) {
        Java java=new Java(100);
        OS os=new OS(100);
        DBMS dbms=new DBMS(100);

        StudentRavi studentRavi=new StudentRavi("Ravi",java,os,dbms);
        StudentPrasad studentPrasad=new StudentPrasad("Prasad",java,os,dbms);
        StudentSai studentSai=new StudentSai("Sai",java,os,dbms);

        studentRavi.displayStudentRavi();
        studentPrasad.displayStudentPrasad();
        studentSai.displayStudentSai();
    }
}
