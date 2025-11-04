package com.xworkz.gadgets.external;

import com.xworkz.gadgets.dto.BluetoothDto;

public class BluetoothRunner {

        public static void main(String[] args) {
            BluetoothDto blutooth=new BluetoothDto();
            blutooth.setPrice(2000);
            int ammount = blutooth.getPrice();
            System.out.println("ammount=" + ammount);
            blutooth.setName("fastrack");
            String name = blutooth.getName();
            System.out.println("name=" + name);
            blutooth.setReview(9.5f);
            float review = blutooth.getReview();
            blutooth.setRateing(6.7);
            double rate = blutooth.getGetRateing();
            System.out.println("rateing=" + rate);
            blutooth.setNumber(990088772);
            long num = blutooth.getNumber();
            System.out.println("num=" + num);
            blutooth.getNumber();
            blutooth.setQulity('A');
            char grade = blutooth.getQulity();
            blutooth.getQulity();
            System.out.println("grade=" + grade);

        }
    }


