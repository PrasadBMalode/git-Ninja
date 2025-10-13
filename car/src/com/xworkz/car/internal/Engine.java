package com.xworkz.car.internal;

public class Engine  {
    public int horsePower;
    public double torque;


    public Engine(int horsePower, double torque){
        this.horsePower=horsePower;
        this.torque=torque;

    }
    public void displayEngine(){
        System.out.println("Engine horse power="+horsePower);
        System.out.println("Engine Torque="+torque);
    }
}
