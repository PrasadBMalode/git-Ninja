package com.xworkz.polyOverridding.external;

import com.xworkz.polyOverridding.internal.ElectronicDevice;
import com.xworkz.polyOverridding.internal.Mobile;

public class ElecMobileRunner {
    public static void main(String[] args) {
        ElectronicDevice obj=new Mobile();
        obj.display();
        obj.brandName();
        obj.productName();
        obj.price();
        obj.isAvailablel();
    }
}
