package com.xworkz.restaurent.external;

import com.xworkz.restaurent.dto.TripLocationDto;

public class TripLocationRunner {

        public static void main(String[] args) {
            TripLocationDto locationDto=new TripLocationDto();
            locationDto.setLocationId(345);
            int id= locationDto.getLocationId();
            System.out.println("id=="+id);

            locationDto.setCity("banglore");
            String name= locationDto.getCity();
            System.out.println("name=="+name);

            locationDto.setLatitude(455.78);
            double latitude= locationDto.getLatitude();
            System.out.println("latitude=="+latitude);

            locationDto.setNumber(547658);
            long number= locationDto.getNumber();
            System.out.println("number=="+number);

            locationDto.setRating(3.5f);
            float rating= locationDto.getRating();
            System.out.println("rating=="+rating);

            locationDto.setType('A');
            char type=locationDto.getType();
            System.out.println("type=="+type);
        }
    }


