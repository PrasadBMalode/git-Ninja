package com.xworkz.trip.dto;

public class PlaceDto {
    private  int price;
    private String name;
    private char grade;
    private long number;
    private float area;
    private double totalArea;


    public void setPrice(int price){
        this.price=price;

    }
    public int getPrice(){
        return price;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
    public char getGrade(){
        return grade;
    }
    public void setNumber(long number){
        this.number=number;
    }
    public long getNumber(){
        return number;
    }
    public void setArea(float area){
        this.area=area;
    }
    public float getArea(){
        return area;
    }
    public void setTotalArea(double totalArea){
        this.totalArea=totalArea;
    }
    public double getTotalArea(){
        return totalArea;
    }
}
