package com.xworkz.restaurent.external;

import com.xworkz.restaurent.dto.PlaceDto;

public class TripPlaceRunner {

        public static void main(String[] args) {
            PlaceDto placeDto=new PlaceDto();

            placeDto.setPrice(1000);
            int amount= placeDto.getPrice();
            System.out.println("entry price=="+amount);

            placeDto.setName("coorg");
            String place= placeDto.getName();
            System.out.println("the place name=="+place);

            placeDto.setGrade('A');
            char grades= placeDto.getGrade();
            System.out.println("the place grade=="+grades);

            placeDto.setNumber(3546476);
            long number= placeDto.getNumber();
            System.out.println("the place number=="+number);

            placeDto.setArea(123.45f);
            float area= placeDto.getArea();
            System.out.println("the area of a place=="+area);

            placeDto.setTotalArea(234.566);
            double totalArea= placeDto.getTotalArea();
            System.out.println("total area=="+totalArea);
        }
    }


