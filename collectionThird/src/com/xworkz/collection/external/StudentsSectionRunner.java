package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentsSectionRunner {
    public static void main(String[] args) {
        List<Character> typeList = new ArrayList<>();
        typeList.add('A');
        typeList.add('B');
        typeList.add('C');
        typeList.add('D');
        typeList.add('E');
        typeList.add('F');
        typeList.add('G');
        typeList.add('H');

        ListIterator<Character> typeIterator = typeList.listIterator();
        while (typeIterator.hasNext()) {
            Object object = typeIterator.next();
            Character type = (Character) object;
            if (type == 'B') {
                typeIterator.add('E');
            }
            if (type == 'C') {
                typeIterator.add('F');
            }
            System.out.println(type);
        }
        System.out.println("Final list of types===" + typeList);
    }
}
