package com.xworkz.polymorphism.internal;

public class Gold extends Metal {

    public boolean isOriginal;

    public String metalName;
    public double metalPrice;
    public long seriesNumber;


    public Gold(boolean isOriginal){
        this.isOriginal=isOriginal;
    }

    public Gold(boolean isOriginal,String metalName, double metalPrice,long seriesNumber){
        super.metalName=metalName;
        super.metalPrice=metalPrice;
        super.seriesNumber=seriesNumber;

    }

    public void gold(){
        System.out.println("is gild original="+isOriginal);
    }
    public void displayGold(){

        System.out.println("this is child gold class method");

    }
    public void goldMethod(){
        System.out.println("metal name="+super.metalName);
        System.out.println("gold price="+super.metalPrice);
        System.out.println("gold series number= "+super.seriesNumber);
    }


}
