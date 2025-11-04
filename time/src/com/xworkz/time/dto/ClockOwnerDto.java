package com.xworkz.clock.dto;

public class ClockOwnerDto {

        private String name;
        private int ownerId;
        private long contactNumber;
        private float height;
        private double weight;
        private char gender;

        public void setName(String name)
        {
            this.name=name;
        }
        public String getName()
        {
            return name;
        }
        public void setOwnerId(int ownerId)
        {
            this.ownerId=ownerId;
        }
        public int getOwnerId()
        {
            return ownerId;
        }
        public void setContactNumber(long contactNumber)
        {
            this.contactNumber=contactNumber;
        }
        public long getContactNumber()
        {
            return contactNumber;
        }
        public void setWeight(double weight)
        {
            this.weight=weight;
        }
        public double getWeight()
        {
            return weight;
        }
        public void setHeight(float height)
        {
            this.height=height;
        }
        public float getHeight()
        {
            return height;
        }
        public void setGender(char gender)
        {
            this.gender=gender;
        }
        public char getGender()
        {
            return gender;
        }
    }


