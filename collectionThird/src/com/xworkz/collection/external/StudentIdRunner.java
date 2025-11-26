package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentIdRunner {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(105);
        list.add(106);
        list.add(108);
        list.add(109);
        list.add(110);
        ListIterator<Integer> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object object=listIterator.next();
            Integer id=(Integer) object;
            if (id==103){
                listIterator.add(104);
            }
            if (id==106){
                listIterator.add(107);
            }
            System.out.println(id);
        }
        System.out.println("fianl list of Student ID's=="+list);
    }
}
