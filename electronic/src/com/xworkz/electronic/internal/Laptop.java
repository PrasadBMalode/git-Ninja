package com.xworkz.electronic.internal;

import com.xworkz.electronic.event.*;

public class Laptop {
    public int displayRam(int ram){
        if (ram>125){
            try {
                throw new LaptopRamException();
            }catch (LaptopRamException laptopRamException){
                laptopRamException.printStackTrace();
                System.out.println("Ram is 125GB");
            }
        }else {
            System.out.println("this is Fake");
        }
        return ram;
    }
    public int displayPrice(int price){
        if (price>100000){
            try {
                throw new LaptopPriceException();
            }catch (LaptopPriceException priceException){
                priceException.printStackTrace();
                System.out.println(" more than 100000 ");
            }
        }else {
            System.out.println("Less than 100000");
        }
        return price;
    }
    public int displayBattery(int day){
        if (day>1){
            try {
                throw new LaptopBatteryException();
            }catch (LaptopBatteryException batteryException){
                batteryException.printStackTrace();
                System.out.println(" more than 100000 ");
            }
        }else {
            System.out.println("Less than 100000");
        }
        return day;
    }
    public String displayBrand(String brand){
        if (brand=="hp"){
            try {
                throw new LapBrandException();

            }catch (LapBrandException lapBrandException){
                lapBrandException.printStackTrace();
                System.out.println("good brand");
            }
        }else {
            System.out.println("brand is fake");
        }
        return brand;
    }
    public String displaylapName(String name){
        if (name=="Ryzen"){
            try {
                throw new LaptopNameException();

            }catch (LaptopNameException nameException){
                nameException.printStackTrace();
                System.out.println("good brand");
            }
        }else {
            System.out.println("brand is fake");
        }
        return name;
    }


}
