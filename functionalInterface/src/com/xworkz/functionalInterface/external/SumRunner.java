package com.xworkz.functionalInterface.external;

import com.xworkz.functionalInterface.bridge.Add;

public class SumRunner {
    public static void main(String[] args) {
        Add add=(a, b) -> a+b;
        int sum= add.calculate(10,5);
        System.out.println("Addition of two number 10 and 5 is==="+sum);
    }
}
