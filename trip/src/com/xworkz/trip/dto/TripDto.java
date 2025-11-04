package com.xworkz.trip.dto;

public class TripDto {
    private int price;
    private String place;
    private long number;
    private float ranking;
    private double maxPrice;
    private char type;

    public void setPrice(int price) {
        this.price=price;
    }
    public int getPrice() {
        return price;
    }
    public void setPlace(String place){

        this.place=place;
    }
    public String getPlace(){

        return place;
    }
    public void setNumber(long number){

        this.number=number;
    }
    public long getNumber(){

        return number;
    }
    public void setRanking(float ranking){

        this.ranking=ranking;
    }
    public float getRanking(){

        return ranking;
    }
    public  void setMaxPrice(double maxPrice){

        this.maxPrice=maxPrice;
    }
    public double getMaxPrice(){

        return maxPrice;
    }
    public void setType(char type){

        this.type=type;
    }
    public char getType(){

        return type;
    }

}
