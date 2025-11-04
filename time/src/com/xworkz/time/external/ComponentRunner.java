package com.xworkz.clock.external;

import com.xworkz.clock.dto.ClockComponentDto;

public class ComponentRunner {

        public static void main(String[] args) {
            ClockComponentDto componentDto=new ClockComponentDto();

            componentDto.setComponentName("Battery");
            String name=componentDto.getComponentName();
            System.out.println("component name :"+name);

            componentDto.setComponentId(4567);
            int id = componentDto.getComponentId();
            System.out.println("component id :"+id);

            componentDto.setSerialNumber(56788888);
            long number = componentDto.getSerialNumber();
            System.out.println("component serialNumber :"+number);

            componentDto.setSizeInCm(2.3f);
            float cm=componentDto.getSizeInCm();
            System.out.println("Component sizeInCm :"+cm);
            componentDto.setWeightInGrams(678.33);
            double weight= componentDto.getWeightInGrams();
            System.out.println("component weight : "+weight);

            componentDto.setQualityGrade('C');
            char grade=componentDto.getQualityGrade();
            System.out.println("Component grade :"+grade);
        }
    }


