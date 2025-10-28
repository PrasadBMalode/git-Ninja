package com.xworkz.demo.bridge;

import com.xworkz.demo.internal.*;

public interface Demo {

    DemoInfo displayDemoInfo(DemoInfo demoInfo);

    DemoDetails displayDemoDetails(DemoDetails demoDetails);

    boolean displayDemoGroup(DemoGroup demoGroup);

    DemoSingle displayDemoSingle(DemoSingle demoSingle);

    DemoSale displayDemoSale(DemoSale demoSale);

}
