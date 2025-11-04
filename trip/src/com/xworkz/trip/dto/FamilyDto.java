package com.xworkz.trip.dto;

public class FamilyDto {
    private String familyAddress;
    private int members;
    private long number;
    private float travelDuration;
    private double tripBudget;
    private char familyType;

    public void setFamilyAddress(String familyAddress){
        this.familyAddress=familyAddress;
    }
    public String getFamilyAddress(){
        return familyAddress;
    }
    public void setMembers(int members){
        this.members=members;
    }
    public int getMembers(){
        return members;
    }
    public void setNumber(long number){
        this.number=number;
    }
    public long getNumber(){
        return number;
    }
    public void setTravelDuration(float travelDuration){
        this.travelDuration=travelDuration;
    }
    public float getTravelDuration(){
        return travelDuration;
    }
    public void setTripBudget(double tripBudget){
        this.tripBudget=tripBudget;
    }
    public double getTripBudget(){
        return tripBudget;
    }
    public void setFamilyType(char familyType){
        this.familyType=familyType;
    }
    public char getFamilyType(){
        return familyType;
    }
}
