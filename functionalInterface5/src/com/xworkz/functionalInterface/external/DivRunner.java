package com.xworkz.functionalInterface.external;

import com.xworkz.functionalInterface.bridge.Div;

public class DivRunner {
    public static void main(String[] args) {
        Div div=(a,b)->a/b;
        int result=div.Calculate(600,5);
        System.out.println("Division of two numbers 600 and 5==="+result);
    }

}
