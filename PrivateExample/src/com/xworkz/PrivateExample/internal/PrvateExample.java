package com.xworkz.PrivateExample.internal;

public class PrvateExample {
    private int price=120;
    private String productName="Parfume";

    public PrvateExample(){

    }

    public static void main(String[] args) {
        PrvateExample prvateExample=new PrvateExample();
        System.out.println(prvateExample.price);
        System.out.println(prvateExample.productName);
    }
}
