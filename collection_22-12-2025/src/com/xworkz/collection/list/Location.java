package com.xworkz.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Location {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Bengalore");
        list.add("Mangalore");
        list.add("Haveri");
        System.out.println(list.toString());
        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());
        list.add("Ranebennur");
        list.add("Byadgi");
        list.add("Davangere");
        list.add("Harihar");
        System.out.println(list.toString());
        list.forEach(n-> System.out.println(n));
        System.out.println(list.size());
    }
}

