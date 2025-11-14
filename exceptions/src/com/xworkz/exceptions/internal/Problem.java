package com.xworkz.exceptions.internal;

import com.xworkz.exceptions.events.InvalidAge;


public class Problem {
    public void checkAge(int age) throws InvalidAge {
        if (age<18){
            throw new InvalidAge("age is valid for voteing");

        }
        else {
            System.out.println("age is valid for voiting");
        }

    }
}
