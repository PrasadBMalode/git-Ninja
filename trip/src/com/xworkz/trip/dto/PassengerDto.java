package com.xworkz.trip.dto;

public class PassengerDto {
    private String name;
    private int id;
    private long number;
    private float height;
    private double balance;
    private char gender;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setNumber(long number){
        this.number=number;
    }
    public long getNumber(){
        return number;
    }
    public void setHeight(float height){
        this.height=height;
    }
    public float getHeight(){
        return height;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }
}
