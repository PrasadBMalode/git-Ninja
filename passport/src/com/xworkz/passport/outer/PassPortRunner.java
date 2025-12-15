package com.xworkz.passport.outer;

public class PassPortRunner {

    static{
        System.err.println("Its a Static Block...");//for static block no need creat instance of class, just main method.
    }


    {
        System.err.println("Its a Instance Block");//for intance block we have creat instance of that particular class.
    }

    public static void main(String[] args) {
        PassPortRunner passPortRunner=new PassPortRunner();

    }
}
