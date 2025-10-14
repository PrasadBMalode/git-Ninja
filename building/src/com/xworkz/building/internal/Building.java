package com.xworkz.building.internal;

public abstract class Building {
    public String buildingName;
    public int noOfBuilding;
    public Floores floores;

    public Building(String buildingName, int noOfBuilding, Floores floores){
        this.buildingName=buildingName;
        this.noOfBuilding=noOfBuilding;
        this.floores=floores;
    }

    public void displayBuilding(){
        System.out.println("Building name="+buildingName);
        System.out.println("number of building="+noOfBuilding);
        System.out.println("floores details="+floores.minNoOfFloores);

    }
}
