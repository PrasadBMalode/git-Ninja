package com.xworkz.gadgets.external;

import com.xworkz.gadgets.dto.LaptopDto;

public class LaptopRunner {


        public static void main(String[] args) {
            LaptopDto laptop=new LaptopDto();
            laptop.setPrice(20000);
            int ammount= laptop.getPrice();
            System.out.println("ammount="+ammount);
            laptop.setName("lenovo");
            String name= laptop.getName();
            System.out.println("name="+name);
            laptop.setReview(9.5f);
            float review= laptop.getReview();
            laptop.setRateing(6.7);
            double rate= laptop.getGetRateing();
            System.out.println("rateing="+rate);
            laptop.setNumber(990088772);
            long num= laptop.getNumber();
            System.out.println("num="+num);
            laptop.getNumber();
            laptop.setQulity('A');
            char grade=laptop.getQulity();
            laptop.getQulity();
            System.out.println("grade="+grade);




        }
    }


