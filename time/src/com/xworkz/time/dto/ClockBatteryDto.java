package com.xworkz.clock.dto;

public class ClockBatteryDto {

        private String clockName;
        private int capacity;
        private long serialNumber;
        private float weight;
        private double maxDischarge;
        private char batteryGrade;

        public void setClockName(String clockName)
        {
            this.clockName=clockName;
        }
        public String getClockName()
        {
            return clockName;
        }
        public void setCapacity(int capacity)
        {
            this.capacity=capacity;
        }
        public int getCapacity()
        {
            return capacity;
        }
        public void setSerialNumber(long serialNumber)
        {
            this.serialNumber=serialNumber;
        }
        public long getSerialNumber()
        {
            return serialNumber;
        }
        public void setWeight(float weight)
        {
            this.weight=weight;
        }
        public float getWeight()
        {
            return weight;
        }
        public void setMaxDischarge(double maxDischarge)

        {
            this.maxDischarge=maxDischarge;
        }
        public double getMaxDischarge()
        {
            return maxDischarge;
        }
        public void setBatteryGrade(char batteryGrade)
        {
            this.batteryGrade=batteryGrade;
        }
        public char getBatteryGrade()
        {
            return batteryGrade;
        }





    }


