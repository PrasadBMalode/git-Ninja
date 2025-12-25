package com.xworkz.exception.customEvent;

public class InvalidLocationException extends Exception{
    public InvalidLocationException(){
        System.out.println("location not found");
    }
}
