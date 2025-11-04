package com.xworkz.clock.dto;

public class ClockDto {


        private String brand;
        private int price;
        private long serialNumber;
        private float diameter;
        private double weight;
        private char type;


        public void setBrand(String brand)
        {
            this.brand=brand;

        }
        public String getBrand(){
            return brand;
        }
        public void setPrice(int price)
        {
            this.price=price;
        }
        public int getPrice()
        {
            return price;
        }
        public void setSerialNumber(long serialNumber)
        {
            this.serialNumber=serialNumber;
        }
        public long getSerialNumber()
        {
            return serialNumber;
        }
        public void setDiameter(float diameter){
            this.diameter=diameter;
        }
        public float getDiameter()
        {
            return diameter;
        }

        public void setWeight(double weight){
            this.weight=weight;
        }
        public double getWeight()
        {
            return weight;
        }
        public void setType(char type){
            this.type=type;
        }
        public char getType()
        {
            return type;
        }



    }


