package com.xworkz.association.oneToOne;

public class NumberDetailsRunner {
    public static void main(String[] args) {
        PhNumber phNumber=new PhNumber("Jio Sim",6360211265l);
        Customer customer=new Customer("Prasad", "Bangalore",phNumber);
        customer.displayCustomerDetails();
    }
}
