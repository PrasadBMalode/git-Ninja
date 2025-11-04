package com.xworkz.trip.dto;

public class HotelDto {
    private int price;
    private String hotelNamee;
    private long registerNumber;
    private float ranking;
    private double maxPrice;
    private char type;

    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void sethotelNamee(String hotelNamee){
        this.hotelNamee=hotelNamee;
    }
    public String gethotelNamee(){
        return hotelNamee;
    }
    public void setregisterNumber(long registerNumber){
        this.registerNumber=registerNumber;
    }
    public long getregisterNumber(){
        return registerNumber;
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
