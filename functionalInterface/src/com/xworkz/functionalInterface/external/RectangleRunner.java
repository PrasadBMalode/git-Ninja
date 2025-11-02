package com.xworkz.functionalInterface.external;

import com.xworkz.functionalInterface.bridge.Rectangle;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle=(l, w) -> l*w;
        int result=rectangle.Calculate(6,8);
        System.out.println("area of rectangle A="+result);
    }
}
