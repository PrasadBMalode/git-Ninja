package com.xworkz.clock.external;

import com.xworkz.clock.dto.ClockDto;

public class ClockRunner {

        public static void main(String[] args) {
            ClockDto clockDto = new ClockDto();
            clockDto.setBrand("Sonata");
            String brandName=clockDto.getBrand();
            System.out.println("Clock brand :"+brandName);

            clockDto.setPrice(2500);
            int amount= clockDto.getPrice();
            System.out.println("Clock price :"+amount);

            clockDto.setSerialNumber(345678912);
            long number=clockDto.getSerialNumber();
            System.out.println("clock serialNumber :"+number);

            clockDto.setDiameter(3.2f);
            float diameters=clockDto.getDiameter();
            System.out.println("Clock diameter :"+diameters);

            clockDto.setWeight(345.23);
            double clockWeight=clockDto.getWeight();
            System.out.println("clock weight :"+clockWeight);

            clockDto.setType('S');
            char clockType=clockDto.getType();
            System.out.println("clock type :"+clockType);


        }
    }


