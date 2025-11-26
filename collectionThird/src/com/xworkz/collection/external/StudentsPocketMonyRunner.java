package com.xworkz.collection.external;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentsPocketMonyRunner {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);
        intList.add(60);
        intList.add(70);
        intList.add(80);

        ListIterator<Integer> intIterator = intList.listIterator();
        while (intIterator.hasNext()) {
            Object object = intIterator.next();
            Integer number = (Integer) object;

            if (number == 20) {
                intIterator.add(25);
            }
            if (number == 60) {
                intIterator.add(65);
            }
            System.out.println(number);
        }
        System.out.println("Final list of int values===" + intList);

    }
}
