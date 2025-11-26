package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RegistrationRunner {
    public static void main(String[] args) {
        List<Long> regNumberList = new ArrayList<>();
        regNumberList.add(1001001001l);
        regNumberList.add(1001001002l);
        regNumberList.add(1001001003l);
        regNumberList.add(1001001004l);
        regNumberList.add(1001001005l);
        regNumberList.add(1001001006l);
        regNumberList.add(1001001007l);
        regNumberList.add(1001001008l);

        ListIterator<Long> regIterator = regNumberList.listIterator();
        while (regIterator.hasNext()) {
            Object object = regIterator.next();
            Long regNo = (Long) object;

            if (regNo == 1001001002l) {
                regIterator.add(1001001010l);
            }
            if (regNo == 1001001006l) {
                regIterator.add(1001001015l);
            }
            System.out.println(regNo);
        }
        System.out.println("Final list of registration numbers===" + regNumberList);

    }
}
