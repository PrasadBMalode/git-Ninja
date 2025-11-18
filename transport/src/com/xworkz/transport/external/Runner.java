package com.xworkz.transport.external;

import com.xworkz.transport.internal.Transport;

public class Runner {
    public static void main(String[] args) {
        Transport transport=new Transport();
        transport.bus("KA161017");
        //transport.bus("KA161016");

        transport.condition(true);

        transport.cost(55);

        transport.total(2.999);

        transport.transport("public");
    }
}
