package com.xworkz.collectionFirst.external;

import java.util.ArrayList;
import java.util.Collection;

public class PhNumberRunner {
    public static void main(String[] args) {
        Collection<Long> phNumber=new ArrayList<>();

        phNumber.add(6360211265l);
        phNumber.add(480295666l);
        phNumber.add(7760211265l);

        System.out.println("all number list details==="+phNumber.toString());
        System.out.println("total numbers==="+phNumber.size());

        phNumber.clear();
        System.out.println("total numbers ofter clearing==="+phNumber.size());

    }
}
