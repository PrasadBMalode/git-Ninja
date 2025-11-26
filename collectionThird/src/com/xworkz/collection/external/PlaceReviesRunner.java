package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PlaceReviesRunner {
    public static void main(String[] args) {
        List<Boolean> goodPlaceList = new ArrayList<>();
        goodPlaceList.add(true);
        goodPlaceList.add(false);
        goodPlaceList.add(true);
        goodPlaceList.add(false);
        goodPlaceList.add(true);
        goodPlaceList.add(false);
        goodPlaceList.add(true);
        goodPlaceList.add(false);

        ListIterator<Boolean> goodPlaceIterator = goodPlaceList.listIterator();
        while (goodPlaceIterator.hasNext()) {
            Object object = goodPlaceIterator.next();
            Boolean isGood = (Boolean) object;

            if (isGood == true) {
                goodPlaceIterator.add(false);
            }
            if (isGood == false) {
                goodPlaceIterator.add(true);
            }
            System.out.println(isGood);
        }
        System.out.println("Final list of good places review===" + goodPlaceList);

    }
}
