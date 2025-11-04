package com.xworkz.gadgets.external;

import com.xworkz.gadgets.dto.WashingMachineDto;

public class WashingMachineRunner {


        public static void main(String[] args) {
            WashingMachineDto washinMashin =new WashingMachineDto();
            washinMashin.setPrice(2000);
            int ammount = washinMashin.getPrice();
            System.out.println("ammount=" + ammount);
            washinMashin.setName("fastrack");
            String name =washinMashin.getName();
            System.out.println("name=" + name);
            washinMashin.setReview(9.5f);
            float review =washinMashin.getReview();
            washinMashin.setRateing(6.7);
            double rate = washinMashin.getGetRateing();
            System.out.println("rateing=" + rate);
            washinMashin.setNumber(990088772);
            long num =washinMashin.getNumber();
            System.out.println("num=" + num);

            washinMashin.setQulity('A');
            char grade = washinMashin.getQulity();
            washinMashin.getQulity();
            System.out.println("grade=" + grade);

        }

    }


