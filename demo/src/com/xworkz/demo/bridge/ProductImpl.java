package com.xworkz.demo.bridge;

import com.xworkz.demo.internal.*;

public class ProductImpl implements Product{
    @Override
    public DemoInfo displayDemoInfo(DemoInfo demoInfo) {
        return null;
    }

    @Override
    public DemoDetails displayDemoDetails(DemoDetails demoDetails) {
        return null;
    }

    @Override
    public boolean displayDemoGroup(DemoGroup demoGroup) {
        return false;
    }

    @Override
    public DemoSingle displayDemoSingle(DemoSingle demoSingle) {
        return null;
    }

    @Override
    public DemoSale displayDemoSale(DemoSale demoSale) {
        return null;
    }
}
