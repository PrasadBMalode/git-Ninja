package com.xworkz.building_array.internal;

public class Building {
    public void displayBuilding(Floor[] floors) {
        for (Floor floor : floors) {
            floor.displayFloor();
        }
    }
}
