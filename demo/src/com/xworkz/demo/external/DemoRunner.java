package com.xworkz.demo.external;

import com.xworkz.demo.bridge.*;
import com.xworkz.demo.internal.*;

public class DemoRunner {
    public static void main(String[] args) {

        System.out.println("its a Demo interface implimentation");
        Demo demo=new DemoImpl();
        DemoInfo demoInfo=new DemoInfo("Watch",2999);
        //DemoInfo result =demo.displayDemoInfo(demoInfo);
        //System.out.println("Result is=="+result);
        demo.displayDemoInfo(demoInfo);
        System.out.println("Product name==="+demoInfo.productName);
        System.out.println("Product price==="+demoInfo.price);

        DemoDetails demoDetails=new DemoDetails("Ring",true);
        demo.displayDemoDetails(demoDetails);
        System.out.println("product name==="+demoDetails.productName);
        System.out.println("is ring looks good==="+demoDetails.isgood);

        DemoGroup demoGroup=new DemoGroup('D',"Demo");
        demo.displayDemoGroup(demoGroup);
        System.out.println("group charecter=="+demoGroup.groupCharector);
        System.out.println("group name==="+demoGroup.groupName);

        DemoSingle demoSingle=new DemoSingle(9.9f,8.9999);
        demo.displayDemoSingle(demoSingle);
        System.out.println("Demo single ranking==="+demoSingle.demoRanking);
        System.out.println("demoSingle price==="+demoSingle.demoPrice);

        DemoSale demoSale=new DemoSale("XworkZ",9.9f);
        demo.displayDemoSale(demoSale);
        System.out.println("Demo saling Company==="+demoSale.demoSaleCompany);
        System.out.println("Company saling ranking==="+demoSale.companyRanking);

        System.out.println("----------------------------------------------------------");
        System.out.println("its a Demo second time implimentation..............");

        Demo demo2=new DemoSecondImpl();

        demo2.displayDemoInfo(demoInfo);
        System.out.println("Product name==="+demoInfo.productName);
        System.out.println("Product price==="+demoInfo.price);

        demo2.displayDemoSale(demoSale);
        System.out.println("Demo saling Company==="+demoSale.demoSaleCompany);
        System.out.println("Company saling ranking==="+demoSale.companyRanking);

        demo2.displayDemoSingle(demoSingle);
        System.out.println("Demo single ranking==="+demoSingle.demoRanking);
        System.out.println("demoSingle price==="+demoSingle.demoPrice);

        demo2.displayDemoDetails(demoDetails);
        System.out.println("product name==="+demoDetails.productName);
        System.out.println("is ring looks good==="+demoDetails.isgood);

        demo2.displayDemoGroup(demoGroup);
        System.out.println("group charecter=="+demoGroup.groupCharector);
        System.out.println("group name==="+demoGroup.groupName);

        System.out.println("------------------------------------------------");
        System.out.println("its a Demo third time implimentation...............");
        Demo demo3=new DemoThirdImpl();

        demo3.displayDemoGroup(demoGroup);
        System.out.println("group charecter=="+demoGroup.groupCharector);
        System.out.println("group name==="+demoGroup.groupName);

        demo3.displayDemoInfo(demoInfo);
        System.out.println("Product name==="+demoInfo.productName);
        System.out.println("Product price==="+demoInfo.price);

        demo3.displayDemoSale(demoSale);
        System.out.println("Demo saling Company==="+demoSale.demoSaleCompany);
        System.out.println("Company saling ranking==="+demoSale.companyRanking);

        demo3.displayDemoDetails(demoDetails);
        System.out.println("product name==="+demoDetails.productName);
        System.out.println("is ring looks good==="+demoDetails.isgood);

        demo3.displayDemoSingle(demoSingle);
        System.out.println("Demo single ranking==="+demoSingle.demoRanking);
        System.out.println("demoSingle price==="+demoSingle.demoPrice);

        System.out.println("-------------------------------------------------");
        System.out.println("its a Demo fourth time implimentation...................");
        Demo demo4=new DemoFourthImpl();

        demo4.displayDemoSingle(demoSingle);
        System.out.println("Demo single ranking==="+demoSingle.demoRanking);
        System.out.println("demoSingle price==="+demoSingle.demoPrice);

        demo4.displayDemoSale(demoSale);
        System.out.println("Demo saling Company==="+demoSale.demoSaleCompany);
        System.out.println("Company saling ranking==="+demoSale.companyRanking);

        demo4.displayDemoInfo(demoInfo);
        System.out.println("Product name==="+demoInfo.productName);
        System.out.println("Product price==="+demoInfo.price);

        demo4.displayDemoGroup(demoGroup);
        System.out.println("group charecter=="+demoGroup.groupCharector);
        System.out.println("group name==="+demoGroup.groupName);

        demo4.displayDemoDetails(demoDetails);
        System.out.println("product name==="+demoDetails.productName);
        System.out.println("is ring looks good==="+demoDetails.isgood);

        System.out.println("----------------------------------------------");
        System.out.println("its a Product interface implimentation................");
        Product product=new ProductImpl();

        product.displayDemoDetails(demoDetails);
        System.out.println("product name==="+demoDetails.productName);
        System.out.println("is ring looks good==="+demoDetails.isgood);

        product.displayDemoInfo(demoInfo);
        System.out.println("Product name==="+demoInfo.productName);
        System.out.println("Product price==="+demoInfo.price);

        product.displayDemoGroup(demoGroup);
        System.out.println("group charecter=="+demoGroup.groupCharector);
        System.out.println("group name==="+demoGroup.groupName);

        product.displayDemoSale(demoSale);
        System.out.println("Demo saling Company==="+demoSale.demoSaleCompany);
        System.out.println("Company saling ranking==="+demoSale.companyRanking);

        product.displayDemoSingle(demoSingle);
        System.out.println("Demo single ranking==="+demoSingle.demoRanking);
        System.out.println("demoSingle price==="+demoSingle.demoPrice);

        System.out.println("------------------------------------------------------");
        System.out.println("its a Things interface implimentation...................");

        Things things=new ThingsImpl();

        things.displayDemoDetails(demoDetails);
        System.out.println("product name==="+demoDetails.productName);
        System.out.println("is ring looks good==="+demoDetails.isgood);

        things.displayDemoInfo(demoInfo);
        System.out.println("Product name==="+demoInfo.productName);
        System.out.println("Product price==="+demoInfo.price);

        things.displayDemoGroup(demoGroup);
        System.out.println("group charecter=="+demoGroup.groupCharector);
        System.out.println("group name==="+demoGroup.groupName);

        things.displayDemoSale(demoSale);
        System.out.println("Demo saling Company==="+demoSale.demoSaleCompany);
        System.out.println("Company saling ranking==="+demoSale.companyRanking);


        things.displayDemoSingle(demoSingle);
        System.out.println("Demo single ranking==="+demoSingle.demoRanking);
        System.out.println("demoSingle price==="+demoSingle.demoPrice);





    }
}
