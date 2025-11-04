package com.xworkz.gadgets.external;

import com.xworkz.gadgets.dto.SmartWatchDto;

public class SmartWatchRunner {


        public static void main(String[] args) {
            SmartWatchDto smartWatch=new SmartWatchDto();

            smartWatch.setPrice(2000);
            int ammount = smartWatch.getPrice();
            System.out.println("ammount=" + ammount);
            smartWatch.setName("fastrack");
            String name = smartWatch.getName();
            System.out.println("name=" + name);
            smartWatch.setReview(9.5f);
            float review = smartWatch.getReview();
            smartWatch.setRateing(6.7);
            double rate = smartWatch.getGetRateing();
            System.out.println("rateing=" + rate);
            smartWatch.setNumber(990088772);
            long num = smartWatch.getNumber();
            System.out.println("num=" + num);
            smartWatch.getNumber();
            smartWatch.setQulity('A');
            char grade = smartWatch.getQulity();
            smartWatch.getQulity();
            System.out.println("grade=" + grade);

        }
    }


