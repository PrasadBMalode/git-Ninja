package com.xworkz.clock.external;

import com.xworkz.clock.dto.ClockOwnerDto;

public class OwnerRunner {

        public static void main(String[] args) {
            ClockOwnerDto ownerDto=new ClockOwnerDto();
            ownerDto.setName("Varun");
            String name=ownerDto.getName();
            System.out.println("Owner Name :"+name);

            ownerDto.setOwnerId(34);
            int id =ownerDto.getOwnerId();
            System.out.println("owner id :"+id);

            ownerDto.setWeight(45.67);
            double weight=ownerDto.getWeight();
            System.out.println("weight :"+weight);


            ownerDto.setHeight(5.4f);
            float height=ownerDto.getHeight();
            System.out.println("owner height :"+height);

            ownerDto.setContactNumber(9089789065l);
            long number=ownerDto.getContactNumber();
            System.out.println("Owner number :"+number);
            ownerDto.setGender('M');
            char gender=ownerDto.getGender();
            System.out.println("owner gender :"+gender);
        }
    }


