package com.xworkz.demo.bridge;

import com.xworkz.demo.internal.*;

public class DemoImpl implements Demo{


    @Override
    public DemoInfo displayDemoInfo(DemoInfo demoInfo) {

        if (demoInfo.price>100){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        return demoInfo;
    }

    @Override
    public DemoDetails displayDemoDetails(DemoDetails demoDetails) {

        if (demoDetails.productName=="Ring"){
            System.out.println("the product is same");
        }
        else {
            System.out.println("miss match product");
        }
        return demoDetails;
    }

    @Override
    public boolean displayDemoGroup(DemoGroup demoGroup) {

        if(demoGroup.groupCharector=='D'){
            System.out.println("this is group D");
        }
        else {
            System.out.println("this is another group");
        }
        return false;
    }

    @Override
    public DemoSingle displayDemoSingle(DemoSingle demoSingle) {
        if(demoSingle.demoPrice>800){
            System.out.println("the demoSingle price is above 800");
        }
        else {
            System.out.println("belove 800");
        }
        return demoSingle;
    }

    @Override
    public DemoSale displayDemoSale(DemoSale demoSale) {
        if(demoSale.companyRanking>8){
            System.out.println("its a good saling company");
        }
        else {
            System.out.println("its not a good company");
        }
        return demoSale;
    }
}
