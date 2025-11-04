package com.xworkz.gadgets.external;

import com.xworkz.gadgets.dto.WatchDto;

public class WatchRunner {


        public static void main(String[] args) {
            WatchDto watch=new WatchDto();
            watch.setPrice(2000);
            int ammount = watch.getPrice();
            System.out.println("ammount=" + ammount);
            watch.setName("fastrack");
            String name = watch.getName();
            System.out.println("name=" + name);
            watch.setReview(9.5f);
            float review = watch.getReview();
            watch.setRateing(6.7);
            double rate = watch.getGetRateing();
            System.out.println("rateing=" + rate);
            watch.setNumber(990088772);
            long num = watch.getNumber();
            System.out.println("num=" + num);
            watch.getNumber();
            watch.setQulity('A');
            char grade = watch.getQulity();
            watch.getQulity();
            System.out.println("grade=" + grade);

        }
    }


