package com.xworkz.collectionFirst.external;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeSalaryRunner {
    public static void main(String[] args) {
        Collection<Float> collection=new ArrayList<>();

        collection.add(35.5f);
        collection.add(40.5f);
        collection.add(45.5f);
        collection.add(50.8f);

        System.out.println("all employee salary list=="+collection.toString());
        System.out.println("total number employes salary list== "+collection.size());


        collection.clear();
        System.out.println("after clearing employees list=="+collection.size());

        collection.add(70.8f);
        System.out.println("new employe salry list=="+collection.toString());
        System.out.println(collection.size());
    }
}
