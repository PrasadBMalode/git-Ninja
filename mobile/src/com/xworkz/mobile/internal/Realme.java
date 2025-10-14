package com.xworkz.mobile.internal;

public abstract class Realme {
    public String mobileName;
    public int rom;
    public double mobilePrice;
    public CameraMP cameraMP;

    public Realme(String mobileName, int rom, double mobilePrice, CameraMP cameraMP){
        this.mobileName=mobileName;
        this.rom=rom;
        this.mobilePrice=mobilePrice;
        this.cameraMP=cameraMP;
    }

    public  void displayRealme(){
        System.out.println("mobile name="+mobileName);
        System.out.println("mobile storage capacity="+rom);
        System.out.println("realme mobile price="+mobilePrice);
        System.out.println("Realme cameara details="+cameraMP.cameraMP);
    }
}
