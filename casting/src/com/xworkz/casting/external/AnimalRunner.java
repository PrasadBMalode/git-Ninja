package com.xworkz.casting.external;

import com.xworkz.casting.internal.Animal;
import com.xworkz.casting.internal.Dog;

public class AnimalRunner {
    public static void main(String [] args) {
    Animal animals=new Dog();
        animals.displayAnimal();

        Dog dogs=(Dog) animals;
        dogs.displayDog();


    }
}
