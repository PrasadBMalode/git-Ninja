package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

public class StudentNumberRunner {
    public static void main(String[] args) {
        List<Long> list=new ArrayList<>();
        list.add(6360211265l);
        list.add(9480295666l);
        list.add(9876543212l);
        list.add(9898787656l);
        list.add(9988776655l);
        list.add(6767655654l);
        list.add(5678987654l);
        list.add(4567654323l);
        ListIterator<Long> listIterator= list.listIterator();
        while (listIterator.hasNext()){
            Object object=listIterator.next();
            Long number=(Long) object;
            if (number==9480295666l){
                listIterator.add(8887765643l);
            }if (number==6767655654l){
                listIterator.add(9998887765l);
            }
            System.out.println(number);
        }
        System.out.println("students number=="+list);

    }
}
