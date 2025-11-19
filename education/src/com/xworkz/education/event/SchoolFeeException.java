package com.xworkz.education.event;

public class SchoolFeeException extends Exception{
    public SchoolFeeException(){
        System.err.println("incomplete fee");
    }
}
