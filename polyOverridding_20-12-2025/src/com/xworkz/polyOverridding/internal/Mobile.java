package com.xworkz.polyOverridding.internal;

public class Mobile extends ElectronicDevice{
    public void display(){
        System.out.println("its child class Mobile ");
    }
    public void brandName(){
        System.out.println("Realme");
    }
    public void productName(){
        System.out.println("its a phone");
    }
    public void price(){
        System.out.println("price= 32.000");
    }
    public void isAvailablel(){
        System.out.println("its not availabal");
    }
}
