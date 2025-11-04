package com.xworkz.clock.dto;

public class ClockComponentDto {
        private String componentName;
        private int componentId;
        private long serialNumber;
        private float sizeInCm;
        private double weightInGrams;
        private char qualityGrade;

        public void setComponentName(String componentName)
        {
            this.componentName=componentName;
        }
        public String getComponentName()
        {
            return componentName;
        }
        public void setComponentId(int componentId)
        {
            this.componentId=componentId;
        }
        public int getComponentId()
        {
            return componentId;
        }
        public void setSerialNumber(long serialNumber)
        {
            this.serialNumber=serialNumber;
        }
        public long getSerialNumber()
        {
            return serialNumber;
        }
        public void setSizeInCm(float sizeInCm)
        {
            this.sizeInCm=sizeInCm;
        }
        public float getSizeInCm()
        {
            return sizeInCm;

        }
        public void setWeightInGrams(double weightInGrams)
        {
            this.weightInGrams=weightInGrams;
        }
        public double getWeightInGrams()
        {
            return weightInGrams;
        }
        public void setQualityGrade(char qualityGrade)
        {
            this.qualityGrade=qualityGrade;
        }
        public char getQualityGrade()
        {
            return qualityGrade;
        }
    }


