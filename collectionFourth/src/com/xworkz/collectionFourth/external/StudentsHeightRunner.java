package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class StudentsHeightRunner {
    public static void main(String[] args) {
        Set<Float> set = new TreeSet<>();
        set.add(5.6f);
        set.add(5.9f);
        set.add(6.1f);
        set.add(5.8f);
        set.add(5.9f);
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add(6.0f);
        set.add(5.7f);
        set.add(6.2f);
        set.add(5.5f);
        set.add(5.7f);
        System.out.println(set.toString());

        set.forEach(n -> System.out.println(n));
    }
}
