

package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudetNameRunner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Prasad");
        list.add("Alphin");
        list.add("Daya");
        list.add("Sharath");
        list.add("Mani");
        list.add("Pavan");
        list.add("Ravi");
        list.add("Bhuvan");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Object object=listIterator.next();
            String name = (String) object;
            if (name == "Alphin") {
                listIterator.add("Manu");
            }
            if (name=="Daya"){
                listIterator.add("Guru");
            }
            System.out.println(name);
        }
        System.out.println("Final list of student name's==="+list);
    }
}

