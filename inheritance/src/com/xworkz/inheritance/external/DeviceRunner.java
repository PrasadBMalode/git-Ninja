package com.xworkz.inheritance.external;

import com.xworkz.inheritance.internal.Laptop;
import com.xworkz.inheritance.internal.Mobile;
import com.xworkz.inheritance.internal.Tab;

public class DeviceRunner {
    public static void main(String[] args) {
        Tab tab=new Tab();
        tab.displayTab();
        tab.displayDevice();

        Mobile mobile=new Mobile();
        mobile.displayMobile();
        mobile.displayDevice();

        Laptop laptop=new Laptop();
        laptop.displayLaptop();
        laptop.displayDevice();
    }
}
