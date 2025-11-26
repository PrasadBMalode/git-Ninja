package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PlaceRunner {
    public static void main(String[] args) {
        List<String> placeList = new ArrayList<>();
        placeList.add("New York");
        placeList.add("London");
        placeList.add("Paris");
        placeList.add("Tokyo");
        placeList.add("Sydney");
        placeList.add("Berlin");
        placeList.add("Dubai");
        placeList.add("Toronto");

        ListIterator<String> placeIterator = placeList.listIterator();
        while (placeIterator.hasNext()) {
            Object object = placeIterator.next();
            String place = (String) object;

            if (place.equals("London")) {
                placeIterator.add("Manchester");
            }
            if (place.equals("Tokyo")) {
                placeIterator.add("Osaka");
            }
            System.out.println(place);
        }
        System.out.println("final place list==="+placeIterator);

    }
}
