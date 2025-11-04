package com.xworkz.clock.external;

import com.xworkz.clock.dto.ClockSoundDto;

public class SoundRunner {

        public static void main(String[] args) {
            ClockSoundDto soundDto=new ClockSoundDto();
            soundDto.setSoundType("nature");
            String sound=soundDto.getSoundType();
            System.out.println("Clock sound type :"+sound);

            soundDto.setSoundDuration(30);
            int duration=soundDto.getSoundDuration();
            System.out.println("Clock sound duration");
            soundDto.setTotalRings(56788888);
            long total=soundDto.getTotalRings();
            System.out.println("Total rings:"+total);

            soundDto.setFrequency(3.4f);
            float mm= soundDto.getFrequency();
            System.out.println("Sound frequency :"+mm);


            soundDto.setSoundLength(345.23);
            double length=soundDto.getSoundLength();
            System.out.println("Sound length");
            soundDto.setMode('A');
            char mode=soundDto.getMode();
            System.out.println("mode :"+mode);

        }
    }





