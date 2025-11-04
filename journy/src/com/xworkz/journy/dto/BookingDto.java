package com.xworkz.trip.dto;

public class BookingDto {
    private String bookingId;
    private int numberOfRooms;
    private double amount;
    private float taxPrice;
    private char bookingStatus;
    private long number;

    public void setBookingId(String bookingId){
        this.bookingId=bookingId;
    }
    public String getBookingId(){
        return bookingId;
    }
    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms=numberOfRooms;
    }
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }
    public void setTaxPrice(float taxPrice){
        this.taxPrice=taxPrice;
    }
    public float getTaxPrice(){
        return taxPrice;
    }
    public void setBookingStatus(char bookingStatus){
        this.bookingStatus=bookingStatus;
    }
    public char getBookingStatus(){
        return bookingStatus;
    }
    public void setNumber(long number){
        this.number=number;
    }
    public long getNumber(){
        return number;
    }

}
