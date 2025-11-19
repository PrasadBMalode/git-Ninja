package com.xworkz.vehicle.internal;

import com.xworkz.vehicle.event.BikeRangeException;

public class BikeRanges {
    public int totalRnge(int total ){
        if(total < 60) {


            try {
                throw new BikeRangeException();

            }catch (BikeRangeException bikeRange){
                bikeRange.printStackTrace();
                System.out.println("not good kl/hr number of the bike range");
            }
        }else{
            System.out.println("best number kl/hr of the bike range");
        }
        return total;
    }
}
