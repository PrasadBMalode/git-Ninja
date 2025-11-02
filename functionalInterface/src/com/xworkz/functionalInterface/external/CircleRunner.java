package com.xworkz.functionalInterface.external;

import com.xworkz.functionalInterface.bridge.Circle;

public class CircleRunner {
    public static void main(String[] args) {
        Circle circle=(r)->3.142*r;
        double result=circle.Calculate(8);
        System.out.println("Area of circle r=8:"+result);
    }
}
