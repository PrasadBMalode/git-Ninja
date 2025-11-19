package com.xworkz.student.event;

public class InvalidStudentIDException extends Exception{
    public InvalidStudentIDException(){
        System.err.println("its a InvalidStudentIDException");
    }
}
