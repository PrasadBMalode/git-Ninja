package com.xworkz.polymorphism.internal;

public class Silver extends Metal {

    public boolean lessValue;

    public Silver(){
       // System.out.println("tis is default construct");
        this(3.678);
    }
    public Silver(double price){
        //System.out.println("this is silver price="+price);
        this(3.678,9876543);

    }
    public Silver(double price, long seriesID){
        System.out.println("silver price=="+price);
        System.out.println("silver series id=="+seriesID);

    }

    public Silver(boolean lessValue){

        this.lessValue=lessValue;
    }


    public void silver(){

        System.out.println("is silver less value comparing to gold="+lessValue);
    }
    public void displaySilver(){

        System.out.println("this is child Silver class method");
    }

    public void SilverMethod(boolean looksGood){
        System.out.println("silver looks good="+looksGood);
    }

    public void SilverMethod(boolean looksGood,char type){
        System.out.println("silver looks good="+looksGood);
        System.out.println("silver charector type=="+type);
    }
    public void SilverMethod(boolean looksGood,char type, float ranking){
        System.out.println("silver looks good=="+looksGood);
        System.out.println("silver charector type=="+type);
        System.out.println("silver ranking=="+ranking);
    }


}
