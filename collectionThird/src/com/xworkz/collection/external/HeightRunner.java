package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class HeightRunner {
    public static void main(String[] args) {
        List<Float> floatList = new ArrayList<>();
        floatList.add(5.1f);
        floatList.add(5.5f);
        floatList.add(6.0f);
        floatList.add(6.5f);
        floatList.add(7.0f);
        floatList.add(7.5f);
        floatList.add(8.0f);
        floatList.add(8.5f);

        ListIterator<Float> floatIterator = floatList.listIterator();
        while (floatIterator.hasNext()) {
            Object object = floatIterator.next();
            Float value = (Float) object;

            if (value == 5.5f) {
                floatIterator.add(5.8f);
            }
            if (value == 7.5f) {
                floatIterator.add(7.8f);
            }
            System.out.println(value);
        }
        System.out.println("Final list of heights===" + floatList);

    }
}
