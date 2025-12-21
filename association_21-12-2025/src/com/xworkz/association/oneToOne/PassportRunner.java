package com.xworkz.association.oneToOne;

public class PassportRunner {
    public static void main(String[] args) {
        Passport passport = new Passport("India", 9876543210L);
        Person person = new Person("Ramesh", "Mysore", passport);
        person.displayPersonDetails();
    }
}
