package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentsHeightRunner {
    public static void main(String[] args) {
        List<Float> heightList = new ArrayList<>();
        heightList.add(5.6f);
        heightList.add(5.2f);
        heightList.add(6.1f);
        heightList.add(5.4f);
        heightList.add(4.4f);
        heightList.add(6.6f);
        heightList.add(7.1f);
        heightList.add(5.5f);

        ListIterator<Float> heightIterator = heightList.listIterator();
        while (heightIterator.hasNext()) {
            Object object = heightIterator.next();
            Float height = (Float) object;
            if (height == 5.2f) {
                heightIterator.add(5.8f);
            }
            if (height == 6.1f) {
                heightIterator.add(5.9f);
            }
            System.out.println(height);
        }
        System.out.println("Final list of heights===" + heightList);
    }
}
