package com.xworkz.association.oneToOne;

public class PhNumber {
    public String name;
    public long number;

    public PhNumber(String name, long number){
        this.name=name;
        this.number=number;
    }
    public void displayNumberDetails(){
        System.out.println("name=="+number);
        System.out.println("number=="+number);
    }
}
