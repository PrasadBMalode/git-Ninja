package com.xworkz.association.oneToOne;

public class Passport {
    public String country;
    public long passportNumber;

    public Passport(String country, long passportNumber) {
        this.country = country;
        this.passportNumber = passportNumber;
    }

    public void displayPassportDetails() {
        System.out.println("country==" + country);
        System.out.println("passportNumber==" + passportNumber);
    }
}
