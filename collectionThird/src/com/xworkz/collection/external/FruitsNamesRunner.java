package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FruitsNamesRunner {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");
        stringList.add("Fig");
        stringList.add("Grape");
        stringList.add("Honeydew");

        ListIterator<String> stringIterator = stringList.listIterator();
        while (stringIterator.hasNext()) {
            Object object = stringIterator.next();
            String fruit = (String) object;

            if (fruit.equals("Banana")) {
                stringIterator.add("Blueberry");
            }
            if (fruit.equals("Fig")) {
                stringIterator.add("Feijoa");
            }
            System.out.println(fruit);
        }
        System.out.println("Final list of Fruits===" + stringList);

    }
}
