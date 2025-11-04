package com.xworkz.electronicdevice.external;

import com.xworkz.electronicdevice.dto.ChargerDto;

public class ChargerDtoRunner {
        public static void main(String[] args) {

            ChargerDto charger=new ChargerDto();
            charger.setPrice(2000);
            int ammount = charger.getPrice();
            System.out.println("ammount=" + ammount);
            charger.setName("fastrack");
            String name = charger.getName();
            System.out.println("name=" + name);
            charger.setReview(9.5f);
            float review =charger.getReview();
            charger.setRateing(6.7);
            double rate = charger.getGetRateing();
            System.out.println("rateing=" + rate);
            charger.setNumber(990088772);
            long num = charger.getNumber();
            System.out.println("num=" + num);

            charger.setQulity('A');
            char grade = charger.getQulity();
            charger.getQulity();
            System.out.println("grade=" + grade);

        }
    }



