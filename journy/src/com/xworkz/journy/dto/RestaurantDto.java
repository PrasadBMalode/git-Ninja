package com.xworkz.trip.dto;

public class RestaurantDto {
    private String name;
    private int restaurantId;
    private double ratingScore;
    private char category;
    private long number;
    private float gstRate;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRatingScore(double ratingScore) {
        this.ratingScore = ratingScore;
    }

    public double getRatingScore() {
        return ratingScore;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public char getCategory() {
        return category;
    }

    public void setNumber(long number) {
        this.number = number;
    }
    public long getNumber(){
        return number;
}

    public void setGstRate(float gstRate) {
        this.gstRate = gstRate;
    }

    public float getGstRate() {
        return gstRate;
    }
}
