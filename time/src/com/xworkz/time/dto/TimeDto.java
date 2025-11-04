package com.xworkz.clock.dto;

public class TimeDto {

        private String label;
        private int seconds;
        private long totalMilliseconds;
        private float alarmVolume;
        private double countdownSpeed;
        private char mode;

        public void setLabel(String label)
        {
            this.label=label;
        }
        public String getLabel()
        {
            return  label;
        }
        public void setSeconds(int seconds)
        {
            this.seconds=seconds;
        }
        public int getSeconds()
        {
            return seconds;
        }
        public void setTotalMilliseconds(long totalMilliseconds)
        {
            this.totalMilliseconds=totalMilliseconds;
        }
        public long getTotalMilliseconds()
        {
            return totalMilliseconds;
        }
        public void setAlarmVolume(float alarmVolume)
        {
            this.alarmVolume=alarmVolume;
        }
        public float getAlarmVolume()
        {
            return alarmVolume;
        }
        public void setCountdownSpeed(double countdownSpeed)
        {
            this.countdownSpeed=countdownSpeed;
        }
        public double getCountdownSpeed()
        {
            return countdownSpeed;
        }
        public void setMode(char mode)
        {
            this.mode=mode;
        }
        public char getMode()
        {
            return  mode;
        }
    }


