package com.xworkz.collection.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RegistrationNUmber {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(101);
        set.add(108);
        set.add(103);
        System.out.println(set.toString());
        System.out.println(set.size());

        set.clear();
        System.out.println(set.size());
        set.add(104);
        set.add(105);
        set.add(106);
        set.add(105);
        System.out.println(set.toString());
        System.out.println(set.size());
    }
}