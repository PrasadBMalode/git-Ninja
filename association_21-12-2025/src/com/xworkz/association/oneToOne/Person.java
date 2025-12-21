package com.xworkz.association.oneToOne;

public class Person {
    public String personName;
    public String city;
    public Passport passport;

    public Person(String personName, String city, Passport passport) {
        this.personName = personName;
        this.city = city;
        this.passport = passport;
    }

    public void displayPersonDetails() {
        System.out.println("personName==" + personName);
        System.out.println("city==" + city);
        System.out.println("PassportCountry==" + passport.country);
        System.out.println("PassportNumber==" + passport.passportNumber);
    }
}
