package com.xworkz.vehicle.internal;

import com.xworkz.vehicle.event.BikeCapException;

public class BikeCapacity {
    public int numberLitter(int ltr){
        if(ltr==8){
            try
            {
                throw new BikeCapException();

            }catch (BikeCapException bikeCap){
                bikeCap.printStackTrace();
                System.out.println("total number 8 ltr");
            }

        }else {
            System.out.println("total number more than ltr");
        }
        return ltr;
    }

}
