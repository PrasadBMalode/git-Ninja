package com.xworkz.association.oneToOne;

public class Customer {
    public String customerName;
    public String location;
    public PhNumber phNumber;

    public Customer(String customerName, String location, PhNumber phNumber){
        this.customerName=customerName;
        this.location=location;
        this.phNumber=phNumber;
    }
    public void displayCustomerDetails(){
        System.out.println("customerName=="+customerName);
        System.out.println("location=="+location);
        System.out.println("PhoneNumberDetails=="+phNumber.name);
        System.out.println("PhoneNumberDetails=="+phNumber.number);

    }

}
