package com.xworkz.polyOverridding.external;

import com.xworkz.polyOverridding.internal.MangoTree;
import com.xworkz.polyOverridding.internal.Plant;

public class PlantTreeRunner {
    public static void main(String[] args) {
        Plant obj= new MangoTree();
        obj.display();
        obj.name();
        obj.colore();

    }
}
