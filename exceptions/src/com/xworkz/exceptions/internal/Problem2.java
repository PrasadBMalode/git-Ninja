package com.xworkz.exceptions.internal;

import com.xworkz.exceptions.events.HighCostException;

public class Problem2 {
    public void checkPrice(int cost) throws HighCostException {
        if(cost>8999){
            throw new HighCostException("its too high cost product");
        }
        else {
            System.out.println("its a normal cost product");
        }
    }
}
