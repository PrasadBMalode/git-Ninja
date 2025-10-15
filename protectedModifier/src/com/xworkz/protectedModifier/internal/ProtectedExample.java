package com.xworkz.protectedModifier.internal;

public class ProtectedExample {

    protected int price=200;
    protected String productName="Night pant";

    public ProtectedExample(){

    }

    public static void main(String[] args) {
        ProtectedExample protectedExample=new ProtectedExample();
        System.out.println(protectedExample.price);
        System.out.println(protectedExample.productName);
    }
}

