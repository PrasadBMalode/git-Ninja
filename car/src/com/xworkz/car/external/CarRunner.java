package com.xworkz.car.external;

import com.xworkz.car.internal.Car;
import com.xworkz.car.internal.CarDetails;
import com.xworkz.car.internal.Engine;

public class CarRunner {
    public static void main(String[] args) {
        Engine engine=new Engine(150,250.75);
        Car car=new CarDetails(4,"Petrole",engine);
        car.displayCar();
        }

}
