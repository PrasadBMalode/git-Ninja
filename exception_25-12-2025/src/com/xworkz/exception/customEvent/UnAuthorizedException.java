package com.xworkz.exception.customEvent;

public class UnAuthorizedException extends Exception{
    public UnAuthorizedException(){
        System.out.println("User not found");
    }
}
