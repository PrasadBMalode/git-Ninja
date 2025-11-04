package com.xworkz.restaurent.external;

import com.xworkz.restaurent.dto.FamilyDto;

public class FamilyRunner {

        public static void main(String[] args) {
            FamilyDto familyDto=new FamilyDto();

            familyDto.setFamilyAddress("Malode");
            String address=familyDto.getFamilyAddress();
            System.out.println("family address==="+address);

            familyDto.setMembers(4);
            int members=familyDto.getMembers();
            System.out.println("total members in family===="+members);

            familyDto.setNumber(98456787645l);
            long number=familyDto.getNumber();
            System.out.println("family ph number===="+number);

            familyDto.setTravelDuration(5.5f);
            float duration=familyDto.getTravelDuration();
            System.out.println("travaling duration==="+duration);

            familyDto.setTripBudget(34.999);
            double budget=familyDto.getTripBudget();
            System.out.println("trip budget==="+budget);

            familyDto.setFamilyType('S');
            char type=familyDto.getFamilyType();
            System.out.println("family type==="+type);
        }
    }


