package com.xworkz.trip.external;

import com.xworkz.trip.dto.RestaurantDto;

public class RestaurantRunner {
    public static void main(String[] args) {
        RestaurantDto restaurantDto=new RestaurantDto();
        restaurantDto.setRestaurantId(123);
        int id= restaurantDto.getRestaurantId();
        System.out.println("id=="+id);

        restaurantDto.setCategory('A');
        char category= restaurantDto.getCategory();
        System.out.println("category=="+category);

        restaurantDto.setName("Ayodhya");
        String name=restaurantDto.getName();
        System.out.println("name=="+name);

        restaurantDto.setNumber(2543564);
        long num= restaurantDto.getNumber();
        System.out.println("number=="+num);

        restaurantDto.setGstRate(5.3f);
        float rate= restaurantDto.getGstRate();
        System.out.println("rate="+rate);

        restaurantDto.setRatingScore(345.67);
        double score=restaurantDto.getRatingScore();
        System.out.println("score=="+score);

    }
}
