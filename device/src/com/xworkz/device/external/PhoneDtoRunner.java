package com.xworkz.electronicdevice.external;

import com.xworkz.electronicdevice.dto.PhoneDto;

public class PhoneDtoRunner {

        public static void main(String[] args) {
            PhoneDto phone = new PhoneDto();
            phone.setPrice(10000);
            int ammount = phone.getPrice();
            System.out.println("ammount=" + ammount);
            phone.setName("samsang");
            String name = phone.getName();
            System.out.println("name=" + name);
            phone.setReview(9.9f);
            float reviews=phone.getReview();
            System.out.println("review="+reviews);
            phone.setRateing(6.9);
            double rate= phone.getGetRateing();
            System.out.println("rateing="+rate);
            phone.setQulity('A');
            char grade=phone.getQulity();
            System.out.println("qulity="+grade);
            phone.setNumber(990099008);
            long num=phone.getNumber();
            System.out.println("number="+num);

        }
    }

