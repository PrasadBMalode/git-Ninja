package com.xworkz.vehicle.internal;

import com.xworkz.vehicle.event.BikeCostException;

public class BikePrice {
    public int bikeCost(int Price){
        if(Price < 98){
            try{
                throw new BikeCostException();

            }catch (BikeCostException bikeCost){
                bikeCost.printStackTrace();
                System.out.println("min price is 98 thouse rupey only");
            }
        }else {
            System.out.println("mix is price 98 above rupey only ");
        }
        return Price;
    }
}
