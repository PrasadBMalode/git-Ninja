package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class StudentsNameRunner {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        set.add("Prasad");
        set.add("Manu");
        set.add("Guru");
        set.add("Bhuvan");
        set.add("Manu");
        set.forEach(n-> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add("Pavan");
        set.add("lucky");
        set.add("harish");
        set.add("ganu");
        set.add("lucky");
        System.out.println(set.toString());
        set.forEach(n-> System.out.println(n));
    }
}
