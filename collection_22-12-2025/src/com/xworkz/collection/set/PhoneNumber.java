package com.xworkz.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PhoneNumber {
    public static void main(String[] args) {
        Set<Long> set=new HashSet<>();
        set.add(9876543567l);
        set.add(6360211265l);
        set.add(9874679637l);
        System.out.println(set.toString());
        System.out.println(set.size());

        set.clear();
        System.out.println(set.size());
        set.add(6789546379l);
        set.add(9867548775l);
        set.add(7658954637l);
        set.add(9480295666l);
        System.out.println(set.toString());
        System.out.println(set.size());
    }
}