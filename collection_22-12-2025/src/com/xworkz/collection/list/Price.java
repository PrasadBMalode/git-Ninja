package com.xworkz.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Price {
    public static void main(String[] args) {
        List<Object> list=new ArrayList<>();
        list.add("Bag");
        list.add(1200);
        list.add("Pant");
        list.add(2000);
        list.add("Shirt");
        list.add(400);
        System.out.println(list.toString());
        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());

    }
}
