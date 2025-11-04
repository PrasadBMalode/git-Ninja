package com.xworkz.electronicdevice.external;

import com.xworkz.electronicdevice.dto.TellivissionDto;

public class TellivisionDtoRunner {

        public static void main(String[] args) {
            TellivissionDto tellivission =new TellivissionDto();
            tellivission.setPrice(60000);
            int ammount = tellivission.getPrice();
            System.out.println("ammount=" + ammount);
            tellivission.setName("sonay");
            String name =tellivission.getName();
            System.out.println("name=" + name);
            tellivission.setReview(9.5f);
            float review =tellivission.getReview();
            tellivission.setRateing(6.7);
            double rate = tellivission.getGetRateing();
            System.out.println("rateing=" + rate);
            tellivission.setNumber(990088772);
            long num =tellivission.getNumber();
            System.out.println("num=" + num);

            tellivission.setQulity('A');
            char grade = tellivission.getQulity();
            tellivission.getQulity();
            System.out.println("grade=" + grade);
        }
    }


