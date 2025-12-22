package com.xworkz.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);
        System.out.println(list.toString());
        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());
        list.add(104);
        list.add(105);
        list.add(106);
        list.add(105);
        System.out.println(list.toString());
        System.out.println(list.size());
    }
}