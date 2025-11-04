package com.xworkz.functionalInterface.external;

import com.xworkz.functionalInterface.bridge.Cubic;

public class CubicRunner {
    public static void main(String[] args) {
        Cubic cubic=(a,b)->(a * a * a) + (3 * a * a * b) + (3 * a * b * b) + (b * b * b);
       int result= cubic.Calculate(6,8);
        System.out.println("Cubic result of a=6 b=8, (a+b)3:"+result);
    }
}
