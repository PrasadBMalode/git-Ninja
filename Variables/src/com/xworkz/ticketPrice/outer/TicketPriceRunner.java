package com.xworkz.ticketPrice.outer;

public class TicketPriceRunner {
    static int staticVar = 100;
    int instanceVar = 200;

    public void display(int parameterVar) {
        int localVar = 300;


        System.out.println(staticVar);
        System.out.println(instanceVar);
        System.out.println(localVar);
        System.out.println(parameterVar);
    }
    public static void main(String[] args) {
        TicketPriceRunner obj = new TicketPriceRunner();
        obj.display(400);


    }

}
