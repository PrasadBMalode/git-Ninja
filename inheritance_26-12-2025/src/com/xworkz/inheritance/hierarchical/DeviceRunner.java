package com.xworkz.inheritance.hierarchical;

public class DeviceRunner {
    public static void main(String[] args) {

        Mobile mobile=new Mobile();
        mobile.displayMobile();
        mobile.displayDevice();

        Laptop laptop=new Laptop();
        laptop.displayLaptop();
        laptop.displayDevice();

        Fan fan=new Fan();
        fan.displayFan();
        fan.displayDevice();
    }
}
