package com.xworkz.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Prasad");
        list.add("Daya");
        list.add("Sai");
        System.out.println(list.toString());
        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());
        list.add("pavan");
        list.add("manu");
        list.add("manu");
        list.add("kumar");
        System.out.println(list.toString());
        System.out.println(list.size());
    }
}
