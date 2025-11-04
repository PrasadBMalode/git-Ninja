package com.xworkz.trip.external;

import com.xworkz.trip.dto.RoomDto;

public class RoomRunner {
    public static void main(String[] args) {
        RoomDto roomDto=new RoomDto();

        roomDto.setRoomNumber(102);
        int number=roomDto.getRoomNumber();
        System.out.println("the room number=="+number);

        roomDto.setRoomType("AC");
        String type= roomDto.getRoomType();
        System.out.println("the room type=="+type);

        roomDto.setCategory('A');
        char category=roomDto.getCategory();
        System.out.println("the category=="+category);

        roomDto.setRoomSize(233.88);
        double roomSize=roomDto.getRoomSize();
        System.out.println("the room size=="+roomSize);

        roomDto.setDiscount(10.00f);
        float discount=roomDto.getDiscount();
        System.out.println("the discount=="+discount);

        roomDto.setBookingId(4356467);
        long bookingId=roomDto.getBookingId();
        System.out.println("booking id=="+bookingId);
    }
}
