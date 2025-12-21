package com.xworkz.association.manyToOne;

public class Hospital {
    public String hospitalName;
    public String hospitalLocation;

    public Hospital(String hospitalName, String hospitalLocation) {
        this.hospitalName = hospitalName;
        this.hospitalLocation = hospitalLocation;
    }

    public void displayHospital() {
        System.out.println("Hospital name == " + hospitalName);
        System.out.println("Hospital location == " + hospitalLocation);
    }
}
