package com.xworkz.employee.event;

public class BadWorkException extends Exception{
    public BadWorkException(){
        System.err.println("its a BadWorkException ");
    }
}
