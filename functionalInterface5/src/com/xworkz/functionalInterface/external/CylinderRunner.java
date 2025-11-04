package com.xworkz.functionalInterface.external;

import com.xworkz.functionalInterface.bridge.Cylinder;

public class CylinderRunner {
    public static void main(String[] args) {
        Cylinder cylinder=(r,h)->3.142*r*r*h;
        double result=cylinder.Calculate(8,4);
        System.out.println("Cylinder Volume of r=8 h=4:"+result);
    }
}
