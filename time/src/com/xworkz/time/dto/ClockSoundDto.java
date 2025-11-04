package com.xworkz.clock.dto;

public class ClockSoundDto {

        private String soundType;
        private int soundDuration;
        private long totalRings;
        private float frequency;
        private double soundLength;
        private char mode;

        public void setSoundType(String soundType)
        {
            this.soundType=soundType;
        }
        public String getSoundType()
        {
            return soundType;
        }
        public void setSoundDuration(int soundDuration)
        {
            this.soundDuration=soundDuration;
        }
        public int getSoundDuration()
        {
            return soundDuration;
        }
        public void setMode(char mode)
        {
            this.mode=mode;
        }
        public char getMode()
        {
            return mode;
        }
        public void setTotalRings(long totalRings)
        {
            this.totalRings=totalRings;
        }
        public long getTotalRings()
        {
            return totalRings;
        }
        public void setFrequency(float frequency)
        {
            this.frequency=frequency;
        }
        public float getFrequency()
        {
            return frequency;
        }
        public void setSoundLength(double soundLength)
        {
            this.soundLength=soundLength;
        }
        public double getSoundLength()
        {
            return soundLength;
        }

    }


