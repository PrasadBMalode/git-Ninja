package com.xworkz.vehicle.internal;

import com.xworkz.vehicle.event.BikeSeatException;

public class BikeSeats {
    public int numberSeats(int seats) {
        if (seats < 2) {
            try {
                throw new BikeSeatException();
            } catch (BikeSeatException bikeSeat) {
                bikeSeat.printStackTrace();
                System.out.println("2 seats only bike range");

            }

        } else {
            System.out.println("3 seats  bike out of range");
        }

        return seats;
    }
}
