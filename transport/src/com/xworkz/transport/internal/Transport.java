package com.xworkz.transport.internal;

import com.xworkz.transport.event.*;

public class Transport {
    public String bus(String busNumber){
        if (busNumber=="KA161017"){
            try {
                throw new InvalidBusNumberException();
            }catch (InvalidBusNumberException invalidBusNumberException){
                invalidBusNumberException.printStackTrace();
                System.out.println("its invalid bus number...");
            }
        }else {
            System.out.println("its a valid bus number...");
        }
        return busNumber;
    }

    public boolean condition(boolean good){
        if(good==true){
            try {
                throw new BadConditionException();
            }catch (BadConditionException badConditionException){
                badConditionException.printStackTrace();
                System.out.println("its in good condition..");
            }
        }else {
            System.out.println("its not in good condition");
        }
        return good;
    }

    public int cost(int cost){
        if (cost<60){
            try {
                throw new HighCostException();
            }catch (HighCostException highCostException){
                highCostException.printStackTrace();
                System.out.println("its too expensive ");
            }
        }else {
            System.out.println("its normal cost");
        }
        return cost;
    }

    public double total(double count){
        if (count<3.999){
            try {
                throw new LessVehicaleException();
            }catch (LessVehicaleException lessVehicaleException){
                lessVehicaleException.printStackTrace();
                System.out.println("vehicals are less..");
            }
        }else {
            System.out.println("vehicals are ok.. ");
        }
        return count;
    }

    public String transport(String type){
        if (type=="public"){
            try {
                throw new NotPublicTransportException();
            }catch (NotPublicTransportException notPublicTransportException){
                notPublicTransportException.printStackTrace();
                System.out.println("its a public transport");
            }
        }else {
            System.out.println("its not a public transport");
        }
        return type;
    }
}
