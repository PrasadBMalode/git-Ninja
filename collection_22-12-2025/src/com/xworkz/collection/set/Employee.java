package com.xworkz.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Prasad");
        set.add("Daya");
        set.add("Mani");
        set.add("Mani");
        System.out.println(set.toString());
        System.out.println(set.size());

        set.clear();
        System.out.println(set.size());

        set.add("Abhi");
        set.add("Kumar");
        set.add("anusha");
        set.forEach(n-> System.out.println(n));
    }
}
