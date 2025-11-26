package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExpenditureRunner {
    public static void main(String[] args) {
        List<Double> expenditureList = new ArrayList<>();
        expenditureList.add(1500.50);
        expenditureList.add(2000.75);
        expenditureList.add(2500.00);
        expenditureList.add(3000.25);
        expenditureList.add(3500.80);
        expenditureList.add(4000.10);
        expenditureList.add(4500.60);
        expenditureList.add(5000.90);

        ListIterator<Double> expenditureIterator = expenditureList.listIterator();
        while (expenditureIterator.hasNext()) {
            Object object = expenditureIterator.next();
            Double expense = (Double) object;

            if (expense == 2000.75) {
                expenditureIterator.add(2200.50);
            }
            if (expense == 4000.10) {
                expenditureIterator.add(4200.75);
            }
            System.out.println(expense);
        }
        System.out.println("Final list of expenditures===" + expenditureList);

    }
}
