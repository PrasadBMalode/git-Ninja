package com.xworkz.polyOverridding.external;

import com.xworkz.polyOverridding.internal.Animal;
import com.xworkz.polyOverridding.internal.Dog;

public class AnimalDogRunner {
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.display();
        obj.displayAge();
        obj.displayBread();
        obj.displayName();
    }
}
