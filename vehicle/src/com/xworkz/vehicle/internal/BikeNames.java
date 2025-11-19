package com.xworkz.vehicle.internal;

import com.xworkz.vehicle.event.BikeNameException;

public class BikeNames {
    public String names(String name){
        if (name=="aravi"){
            try {
                throw new BikeNameException();

            }catch (BikeNameException e){
                e.printStackTrace();
                System.out.println("BikeName error");
            }
        }else  {
            System.err.println("BikeName not correct");
        }
        return name;
    }
}
