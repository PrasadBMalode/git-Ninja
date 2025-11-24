package com.xworkz.collectionFirst.external;

import java.util.ArrayList;
import java.util.Collection;

public class StudentsIDRunner {

    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>();

        collection.add(101);
        collection.add(102);
        collection.add(103);
        collection.add(104);
        collection.add(105);

        System.out.println("the total length of Collection=="+collection.size());

        collection.add(106);
        System.out.println("the total length of Collection=="+collection.size());

        System.out.println("Collection of ID's=="+collection.toString());

        collection.clear();
        System.out.println("the total length of Collection=="+collection.size());

        collection.add(107);
        System.out.println("the total length of Collection=="+collection.size());

    }
}
