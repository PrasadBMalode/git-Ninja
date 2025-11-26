package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentsFeesRunner {
    public static void main(String[] args) {
        List<Double> feesList = new ArrayList<>();
        feesList.add(25000.50);
        feesList.add(30000.75);
        feesList.add(15000.00);
        feesList.add(45000.25);
        feesList.add(52000.40);
        feesList.add(27500.90);
        feesList.add(61000.10);
        feesList.add(38999.99);

        ListIterator<Double> feesIterator = feesList.listIterator();
        while (feesIterator.hasNext()) {
            Object object = feesIterator.next();
            Double fees = (Double) object;
            if (fees == 30000.75) {
                feesIterator.add(32000.55);
            }
            if (fees == 15000.00) {
                feesIterator.add(18000.00);
            }
            System.out.println(fees);
        }
        System.out.println("Final list of fees===" + feesList);
    }
}
