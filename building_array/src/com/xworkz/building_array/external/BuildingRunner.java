package com.xworkz.building_array.external;

import com.xworkz.building_array.internal.Building;
import com.xworkz.building_array.internal.Floor;
import com.xworkz.building_array.internal.Room;

public class BuildingRunner {
    public static void main(String[] args) {

        Building building = new Building();

        Room[] roomsFloor1 = {new Room("fan", "light", "fridg", "mike")};
        Room[] roomsFloor2 = {new Room("light", "bed", "bulb", "speeker")};
        Room[] roomsFloor3 = {new Room("mixi", "glass", "switch", "belt")};
        Room[] roomsFloor4 = {new Room("dore", "plate", "bedsheet", "food")};
        Room[] roomsFloor5 = {new Room("windoe", "sofa", "oil", "fruits")};
        Room[] roomsFloor6 = {new Room("bed", "toy", "gas", "bike")};
        Room[] roomsFloor7 = {new Room("mick", "comb", "lickquid", "car")};

        Floor firstFloor = new Floor("qqf", 101, roomsFloor1);
        Floor secondFloor = new Floor("wwf", 102, roomsFloor2);
        Floor thirdFloor = new Floor("eef", 103, roomsFloor3);
        Floor fourthFloor = new Floor("rrf", 104, roomsFloor4);
        Floor fifthFloor = new Floor("ttf", 105, roomsFloor5);
        Floor sixthFloor = new Floor("yyf", 106, roomsFloor6);
        Floor seventhFloor = new Floor("uuf", 107, roomsFloor7);

        Floor[] floors = {firstFloor, secondFloor, thirdFloor, fourthFloor, fifthFloor, sixthFloor, seventhFloor};

        building.displayBuilding(floors);

    }
}
