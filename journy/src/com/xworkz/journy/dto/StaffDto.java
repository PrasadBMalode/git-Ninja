package com.xworkz.trip.dto;

public class StaffDto {
    private String name;
    private int staffId;
    private double salary;
    private float ratings;
    private char type;
    private long number;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setStaffId(int staffId){
        this.staffId=staffId;
    }
    public int getStaffId(){
        return staffId;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setRatings(float ratings){
        this.ratings=ratings;
    }
    public float getRatings(){
        return ratings;
    }
    public void setType(char type){
        this.type=type;
    }
    public char getType(){
        return type;
    }
    public void setNumber(long number){
        this.number=number;
    }
    public long getNumber(){
        return number;
    }

}
