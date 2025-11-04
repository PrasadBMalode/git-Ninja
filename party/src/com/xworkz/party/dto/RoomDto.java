package com.xworkz.restaurent.dto;

public class RoomDto {

        private int roomNumber;
        private String roomType;
        private char category;
        private double roomSize;
        private float discount;
        private long bookingId;

        public void setRoomNumber(int roomNumber){
            this.roomNumber=roomNumber;
        }
        public int getRoomNumber(){
            return roomNumber;
        }
        public void setRoomType(String roomType){
            this.roomType=roomType;
        }
        public String getRoomType(){
            return roomType;
        }
        public void setCategory(char category){
            this.category=category;
        }
        public char getCategory(){
            return category;
        }
        public void setRoomSize(double roomSize){
            this.roomSize=roomSize;
        }
        public double getRoomSize(){
            return roomSize;
        }
        public void setDiscount(float discount){
            this.discount=discount;
        }
        public float getDiscount(){
            return discount;
        }
        public void setBookingId(long bookingId){
            this.bookingId=bookingId;
        }
        public long getBookingId(){
            return bookingId;
        }
    }


