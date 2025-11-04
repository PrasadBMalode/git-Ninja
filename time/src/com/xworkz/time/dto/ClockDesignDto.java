package com.xworkz.clock.dto;

public class ClockDesignDto {

        private String shape;
        private int designId;
        private long designSerial;
        private float thickness;
        private double weight;
        private char designGrade;

        public void setShape(String shape)
        {
            this.shape=shape;
        }
        public  String getShape()
        {
            return shape;
        }
        public void setDesignId(int designId)
        {
            this.designId=designId;
        }
        public int getDesignId()
        {
            return designId;
        }
        public void setDesignSerial(long designSerial)
        {
            this.designSerial=designSerial;
        }
        public long getDesignSerial()
        {
            return designSerial;
        }
        public void setWeight(double weight)
        {
            this.weight=weight;
        }
        public double getWeight()
        {
            return weight;
        }
        public void setThickness(float thickness)
        {
            this.thickness=thickness;
        }
        public float getThickness()
        {
            return thickness;
        }
        public void setDesignGrade(char designGrade)
        {
            this.designGrade=designGrade;
        }
        public char getDesignGrade()
        {
            return designGrade;
        }
    }


