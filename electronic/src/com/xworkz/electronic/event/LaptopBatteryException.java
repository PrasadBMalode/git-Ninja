package com.xworkz.electronic.event;

public class LaptopBatteryException  extends Exception{
    public LaptopBatteryException(){
        System.err.println("Battery life is less");
    }
}
