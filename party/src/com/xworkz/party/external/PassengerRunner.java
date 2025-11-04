package com.xworkz.restaurent.external;

import com.xworkz.restaurent.dto.PassengerDto;

public class PassengerRunner {

        public static void main(String[] args) {
            PassengerDto passengerDto = new PassengerDto();

            passengerDto.setName("PRASAD");
            String name = passengerDto.getName();
            System.out.println("passenger name===" + name);

            passengerDto.setId(101);
            int id = passengerDto.getId();
            System.out.println("passenger id===" + id);

            passengerDto.setNumber(6360211265l);
            long number = passengerDto.getNumber();
            System.out.println("passanger number===" + number);

            passengerDto.setHeight(5.9f);
            float height = passengerDto.getHeight();
            System.out.println("passanger height===" + height);

            passengerDto.setBalance(78.999);
            double balance = passengerDto.getBalance();
            System.out.println("passanger balance===" + balance);

            passengerDto.setGender('M');
            char gender = passengerDto.getGender();
            System.out.println("passanger gender===" + gender);

        }
    }


