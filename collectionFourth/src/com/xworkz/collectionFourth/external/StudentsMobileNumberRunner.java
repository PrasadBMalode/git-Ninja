package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class StudentsMobileNumberRunner {
    public static void main(String[] args) {
        Set<Long> set = new TreeSet<>();
        set.add(9876543210L);
        set.add(9123456780L);
        set.add(9988776655L);
        set.add(9012345678L);
        set.add(9123456780L);
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add(8899776655L);
        set.add(7766554433L);
        set.add(9988112233L);
        set.add(6655443322L);
        set.add(7766554433L);
        System.out.println(set.toString());
        set.forEach(n -> System.out.println(n));
    }
}
