package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentStatusRunner {
    public static void main(String[] args) {
        List<Boolean> statusList = new ArrayList<>();
        statusList.add(true);
        statusList.add(false);
        statusList.add(true);
        statusList.add(false);
        statusList.add(true);
        statusList.add(false);
        statusList.add(true);
        statusList.add(false);
        ListIterator<Boolean> statusIterator = statusList.listIterator();
        while (statusIterator.hasNext()) {
            Object object = statusIterator.next();
            Boolean status = (Boolean) object;

            if (status == true) {
                statusIterator.add(false);
            }
            if (status == false) {
                statusIterator.add(true);
            }
            System.out.println(status);
        }
        System.out.println("Final list of boolean status===" + statusList);

    }
}
