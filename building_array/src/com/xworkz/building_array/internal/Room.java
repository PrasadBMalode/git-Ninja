package com.xworkz.building_array.internal;

public class Room {
    public String roomFirstProperty;
    public String roomSecondProperty;
    public String roomThirdProperty;
    public String roomFourthProperty;


    public Room(String roomFirstProperty, String roomSecondProperty, String roomThirdProperty,
                String roomFourthProperty) {
        this.roomFirstProperty = roomFirstProperty;
        this.roomSecondProperty = roomSecondProperty;
        this.roomThirdProperty=roomThirdProperty;
        this.roomFourthProperty=roomFourthProperty;

    }

    public void displayRoom() {
        System.out.println("First property inside room: " + roomFirstProperty);
        System.out.println("Second property inside room: " + roomSecondProperty);
        System.out.println("Third property inside room: " + roomThirdProperty);
        System.out.println("Fourth property inside room: " + roomFourthProperty);


    }
}
