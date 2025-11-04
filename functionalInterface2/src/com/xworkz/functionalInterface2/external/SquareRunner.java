package com.xworkz.functionalInterface2.external;

import com.xworkz.functionalInterface2.bridge.Square;

public class SquareRunner {
    public static void main(String[] args) {
        Square squareArea=(side)->side;
        double result = squareArea.Calculate(5);
        System.out.println("Area of square: " + result);
    }
}
