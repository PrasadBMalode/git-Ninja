package com.xworkz.functionalInterface.external;

import com.xworkz.functionalInterface.bridge.CSA;

public class CSARunner {
    public static void main(String[] args) {
        CSA csa=(r,h)->2*3.142*r*h;
        double result=csa.Calculate(6,9);
        System.out.println("Cylinder, Curved Surface Area of r=6 and h=9:"+result);
    }
}
