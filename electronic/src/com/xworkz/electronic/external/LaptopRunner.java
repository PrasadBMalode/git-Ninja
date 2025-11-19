package com.xworkz.electronic.external;

import com.xworkz.electronic.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();

        laptop.displayBattery(2);

        laptop.displayBrand("hp");

        laptop.displaylapName("Ryzen");

        laptop.displayPrice(1000000);
        
        laptop.displayRam(1277);
    }
}
