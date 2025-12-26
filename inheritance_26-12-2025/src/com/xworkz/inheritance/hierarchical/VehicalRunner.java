package com.xworkz.inheritance.hierarchical;

public class VehicalRunner {
    public static void main(String[] args) {

        Bike bike=new Bike();
        bike.displayBike();
        bike.displayVehical();

        Bus bus=new Bus();
        bus.displayBus();
        bus.displayVehical();

        Car car=new Car();
        car.displayCar();
        car.displayVehical();
    }
}
