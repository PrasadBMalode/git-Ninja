package com.xworkz.education.internal;

import com.xworkz.education.event.*;

public class School {

    public long displayTotalStudents(long students){
        if (students>1000){
            try {
                throw new TotalStudents();

            }catch (TotalStudents totalStudents){
                totalStudents.printStackTrace();
                System.out.println(" More than 1000 students ");
            }
        }else {
            System.out.println("Less students in school");
        }
        return students;
    }
    public int displayStudentId(int Id){
        if (Id>101){
            try {
                throw new SchoolIdException();

            }catch (SchoolIdException schoolIdException){
                schoolIdException.printStackTrace();
                System.out.println(" school id is correct ");
            }
        }else {
            System.out.println("school id is fake");
        }
        return Id;
    }
    public long displayTotalStudentsfee(long fee){
        if (fee>50000){
            try {
                throw new SchoolFeeException();

            }catch (SchoolFeeException feeException){
                feeException.printStackTrace();
                System.out.println(" More than 50000 fee ");
            }
        }else {
            System.out.println("every one paid");
        }
        return fee;
    }
    public String displaySchoolName(String name){
        if (name =="Bapuji"){
            try {
                throw new SchoolNameException();

            }catch (SchoolNameException nameException){
                nameException.printStackTrace();
                System.out.println(" School name is correct ");
            }
        }else {
            System.out.println("School name is incorrect");
        }
        return name;
    }
    public String displaySchoolAdrress(String name){
        if (name=="Durga"){
            try {
                throw new SchoolAddressException();

            }catch (SchoolAddressException addressException){
                addressException.printStackTrace();
                System.out.println(" address is correct");
            }
        }else {
            System.out.println("address is fake");
        }
        return name;
    }
}
