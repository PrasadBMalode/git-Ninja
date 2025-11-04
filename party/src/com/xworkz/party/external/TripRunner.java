package com.xworkz.restaurent.external;

import com.xworkz.restaurent.dto.TripDto;

public class TripRunner {

        public static void main(String[] args) {
            TripDto tripDto=new TripDto();

            tripDto.setPrice(6999);
            int amount=tripDto.getPrice();
            System.out.println("trip budget==="+amount);

            tripDto.setPlace("Dandeli");
            String place=tripDto.getPlace();
            System.out.println("trip place name==="+place);

            tripDto.setNumber(98765432);
            long number=tripDto.getNumber();
            System.out.println("driver number==="+number);

            tripDto.setRanking(9.9f);
            float ranking=tripDto.getRanking();
            System.out.println("trip ranking==="+ranking);

            tripDto.setMaxPrice(8.999);
            double maxPrice=tripDto.getMaxPrice();
            System.out.println("maximum trip budget==="+maxPrice);

            tripDto.setType('F');
            char type=tripDto.getType();
            System.out.println("its a family type trip==="+type);
        }
    }


