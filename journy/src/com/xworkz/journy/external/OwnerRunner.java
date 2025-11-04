package com.xworkz.trip.external;

import com.xworkz.trip.dto.OwnerDto;

public class OwnerRunner {
    public static void main(String[] args) {
        OwnerDto ownerDto=new OwnerDto();
        ownerDto.setOwnerId(34);
        int id= ownerDto.getOwnerId();
        System.out.println("id=="+id);

        ownerDto.setGender('F');
        char gender= ownerDto.getGender();
        System.out.println("gender=="+gender);

        ownerDto.setName("Radha");
        String name= ownerDto.getName();
        System.out.println("name=="+name);

        ownerDto.setNumber(5467568);
        long num= ownerDto.getNumber();
        System.out.println("number=="+num);

        ownerDto.setNetWorth(454.8);
        double worth= ownerDto.getNetWorth();
        System.out.println("worth=="+worth);

        ownerDto.setGrowthRate(23.5f);
        float rate= ownerDto.getGrowthRate();
        System.out.println("rate=="+rate);
    }
}
