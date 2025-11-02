package com.xworkz.functionalInterface.external;

import com.xworkz.functionalInterface.bridge.Triangle;

public class TriangleRunner {
    public static void main(String[] args) {
        Triangle triangle=(b,h) -> 0.5*b*h;
        double result=triangle.Calculate(12,10);
        System.out.println("Area of traingle 12 and 10==="+result);
    }

}
