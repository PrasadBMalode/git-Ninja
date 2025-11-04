package com.xworkz.restaurent.dto;

public class TripLocationDto {
        private String city;
        private int locationId;
        private double latitude;
        private float rating;
        private char type;
        private long number;

        public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return city;
        }

        public void setLocationId(int locationId) {
            this.locationId = locationId;
        }

        public int getLocationId() {
            return locationId;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setRating(float rating) {
            this.rating = rating;
        }

        public float getRating() {
            return rating;
        }

        public void setType(char type) {
            this.type = type;
        }

        public char getType() {
            return type;
        }

        public void setNumber(long number) {
            this.number = number;
        }

        public long getNumber() {
            return number;
        }
    }


