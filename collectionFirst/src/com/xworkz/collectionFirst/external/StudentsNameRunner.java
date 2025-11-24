package com.xworkz.collectionFirst.external;

import java.util.ArrayList;
import java.util.Collection;


public class StudentsNameRunner {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Prasad");
        collection.add("Sai");
        collection.add("Vijiya");
        collection.add("Basavaraja");

        System.out.println("collection total length=="+collection.size());

        collection.clear();
        System.out.println(collection.size());

        collection.add("Pinki");
        collection.add("Rony");
        System.out.println("collection after clearing all data=="+collection.size());
    }
}