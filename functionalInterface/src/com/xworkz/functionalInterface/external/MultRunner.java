package com.xworkz.functionalInterface.external;


import com.xworkz.functionalInterface.bridge.Mult;

public class MultRunner {
    public static void main(String[] args) {
        Mult mult=(a,b)->a*b;
        double result=mult.Calculate(23.999,12.999);
        System.out.println("multiplication of two numbers 23.999 and 12.999==="+result);
    }
}
