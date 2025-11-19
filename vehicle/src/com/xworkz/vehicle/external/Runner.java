package com.xworkz.vehicle.external;

import com.xworkz.vehicle.internal.*;

public class Runner {
    public static void main(String[] args) {
        BikeNames bikeName = new BikeNames();
        bikeName.names("aravi");
        BikeRanges bikeRange = new BikeRanges();
        bikeRange.totalRnge(45);
        BikeCapacity bikeCapcity = new BikeCapacity();
        bikeCapcity.numberLitter(9);
        BikeSeats bikeSeats = new BikeSeats();
        bikeSeats.numberSeats(2);
        BikePrice bikePrice = new BikePrice();
        bikePrice.bikeCost(82);
    }
}
