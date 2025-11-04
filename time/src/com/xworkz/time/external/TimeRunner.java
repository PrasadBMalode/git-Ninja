package com.xworkz.clock.external;

import com.xworkz.clock.dto.TimeDto;

public class TimeRunner {

        public static void main(String[] args) {
            TimeDto timeDto=new TimeDto();
            timeDto.setLabel("morning alarm");
            String alarm=timeDto.getLabel();
            System.out.println("Time lable :"+alarm);

            timeDto.setSeconds(45673222);
            int second=timeDto.getSeconds();
            System.out.println("Time seconds :"+second);

            timeDto.setMode('M');
            char timeMode = timeDto.getMode();
            System.out.println("Time mode :"+timeMode);

            timeDto.setAlarmVolume(45.2f);
            float volume=timeDto.getAlarmVolume();
            System.out.println("Time alarm volume :"+volume);

            timeDto.setCountdownSpeed(3452.123);
            double count=timeDto.getCountdownSpeed();
            System.out.println("Time countdown speed :"+count);

            timeDto.setTotalMilliseconds(67890333);
            long total=timeDto.getTotalMilliseconds();
            System.out.println("Time total milliseconds :"+total);

        }
    }


