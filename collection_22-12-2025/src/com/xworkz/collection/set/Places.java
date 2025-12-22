package com.xworkz.collection.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Places{
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("Bengalore");
        set.add("Mangalore");
        set.add("Haveri");
        System.out.println(set.toString());
        System.out.println(set.size());

        set.clear();
        System.out.println(set.size());
        set.add("Ranebennur");
        set.add("Byadgi");
        set.add("Davangere");
        set.add("Harihar");
        System.out.println(set.toString());
        set.forEach(n-> System.out.println(n));
        System.out.println(set.size());
    }
}
