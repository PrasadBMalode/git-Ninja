package com.xworkz.functionalInterface.external;

import com.xworkz.functionalInterface.bridge.Sub;


public class SubRunner {
    public static void main(String[] args) {
        Sub sub=(a, b)->a-b;
        float resuult=sub.Calculate(8.6f,3.2f);
        System.out.println("Subtraction of two numbers 8.6 and 3.2==="+resuult);
    }
}
