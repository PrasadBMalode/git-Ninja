package com.xworkz.trip.dto;

public class ProductDto {
    private String prductName;
    private int price;
    private long seriesNumber;
    private float ranking;
    private double actuelPrice;
    private char productType;

    public void setProductName(String prductName){
        this.prductName=prductName;
    }
    public String getProductName(){
        return prductName;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setSeriesNumber(long seriesNumber){
        this.seriesNumber=seriesNumber;
    }
    public long getSeriesNumber(){
        return seriesNumber;
    }
    public void setRanking(float ranking){
        this.ranking=ranking;
    }
    public float getRanking(){
        return ranking;
    }
    public void setActuelPrice(double actuelPrice){
        this.actuelPrice=actuelPrice;
    }
    public double getActuelPrice(){
        return actuelPrice;
    }
    public void setProductType(char productType){
        this.productType=productType;
    }
    public char getProductType(){
        return productType;
    }
}
