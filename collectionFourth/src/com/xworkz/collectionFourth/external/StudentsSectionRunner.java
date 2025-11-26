package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class StudentsSectionRunner {
    public static void main(String[] args) {
        Set<Character> set = new TreeSet<>();
        set.add('A');
        set.add('B');
        set.add('C');
        set.add('D');
        set.add('B');
        set.forEach(n -> System.out.println(n));

        set.clear();
        System.out.println(set.size());

        set.add('E');
        set.add('F');
        set.add('G');
        set.add('H');
        set.add('E');
        System.out.println(set.toString());

        set.forEach(n -> System.out.println(n));
    }
}
