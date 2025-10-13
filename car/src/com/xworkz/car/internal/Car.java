package com.xworkz.car.internal;

public abstract class Car {
    public int noOfStrocks;
    public String engineType;
    public Engine engine;

    public Car(int noOfStrocks, String engineType, Engine engine){
        this.noOfStrocks= noOfStrocks;
        this.engineType=engineType;
        this.engine=engine;
    }

    public void displayCar(){
        System.out.println("Number of strocks="+noOfStrocks);
        System.out.println("Engine type="+engineType);
        System.out.println("Engine Hors Power="+engine.horsePower);
        System.out.println("Engine Torque="+engine.torque);
    }
}
