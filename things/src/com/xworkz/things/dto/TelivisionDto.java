package com.xworkz.gadgets.dto;

public class TelivisionDto {


        private int price;
        private String name;
        private float review;
        private double rateing;
        private char qulity;
        private  long number;

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName(){
            return name;
        }

        public void setReview(float review) {
            this.review = review;
        }

        public float getReview() {
            return review;
        }

        public void setRateing(double rateing) {
            this.rateing = rateing;
        }


        public double getGetRateing() {
            return rateing;
        }

        public void setQulity(char qulity) {
            this.qulity = qulity;
        }

        public char getQulity() {
            return qulity;
        }

        public void setNumber(long number) {
            this.number = number;
        }

        public long getNumber() {
            return number;
        }

    }


