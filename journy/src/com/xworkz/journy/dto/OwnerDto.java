package com.xworkz.trip.dto;

public class OwnerDto {
    private String name;
    private int ownerId;
    private float growthRate;
    private double netWorth;
    private long number;
    private char gender;

    public void setName(String name){
        this.name=name;
    }
    public  String getName(){
        return name;
    }
    public  void setOwnerId(int ownerId){
        this.ownerId=ownerId;
    }
    public int getOwnerId(){
        return ownerId;
    }

    public void setGrowthRate(float growthRate) {
        this.growthRate = growthRate;
    }

    public float getGrowthRate() {
        return growthRate;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }
}

