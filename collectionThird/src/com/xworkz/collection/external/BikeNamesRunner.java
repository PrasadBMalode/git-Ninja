package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BikeNamesRunner {
    public static void main(String[] args) {
        List<String> bikeList = new ArrayList<>();
        bikeList.add("Honda");
        bikeList.add("Yamaha");
        bikeList.add("Suzuki");
        bikeList.add("KTM");
        bikeList.add("Royal Enfield");
        bikeList.add("Bajaj");
        bikeList.add("TVS");
        bikeList.add("Hero");
        ListIterator<String> bikeIterator = bikeList.listIterator();
        while (bikeIterator.hasNext()) {
            Object object = bikeIterator.next();
            String bike = (String) object;

            if (bike.equals("Yamaha")) {
                bikeIterator.add("Kawasaki");
            }
            if (bike.equals("Royal Enfield")) {
                bikeIterator.add("Ducati");
            }
            System.out.println(bike);
        }
        System.out.println("Final list of bike names===" + bikeList);

    }
}
