package com.xworkz.clock.external;

import com.xworkz.clock.dto.ClockBatteryDto;

public class ClockBatteryRunner {


        public static void main(String[] args) {
            ClockBatteryDto clockBatteryDto = new ClockBatteryDto();

            clockBatteryDto.setClockName("Good Luck");
            String name=clockBatteryDto.getClockName();
            System.out.println("Clock name :"+name);

            clockBatteryDto.setCapacity(345);
            int capacities=clockBatteryDto.getCapacity();
            System.out.println("clock capacity :"+capacities);

            clockBatteryDto.setSerialNumber(3490123);
            long number=clockBatteryDto.getSerialNumber();
            System.out.println("clock serial number :"+number);
            clockBatteryDto.setWeight(1.2f);
            float clock = clockBatteryDto.getWeight();
            System.out.println("clock weight :"+clock);

            clockBatteryDto.setMaxDischarge(56.12);
            double max=clockBatteryDto.getMaxDischarge();
            System.out.println("clock battery discharge :"+max);

            clockBatteryDto.setBatteryGrade('A');
            char grade=clockBatteryDto.getBatteryGrade();
            System.out.println("Grade :"+grade);
        }
    }


