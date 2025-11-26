package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class StudentsIdRunner {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
                set.add(101);
                set.add(205);
                set.add(150);
                set.add(320);
                set.add(205);
                set.forEach(n -> System.out.println(n));
                set.clear();
                System.out.println(set.size());
                set.add(450);
                set.add(300);
                set.add(600);
                set.add(125);
                set.add(300);
                System.out.println(set.toString());
                set.forEach(n -> System.out.println(n));
            }
}



