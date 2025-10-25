package com.xworkz.polymorphism.internal;

public class Metal {

    public boolean isOriginal;
    public String metalName;
    public double metalPrice;
    public long seriesNumber;

    public Metal(){
        System.out.println("this is no argument metal class constructor");
    }
    public void displayMetal(){

        System.out.println("this is Parent Metal class method");
    }
}
