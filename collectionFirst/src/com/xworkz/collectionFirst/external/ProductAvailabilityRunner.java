package com.xworkz.collectionFirst.external;

import java.util.ArrayList;
import java.util.Collection;

public class ProductAvailabilityRunner {
    public static void main(String[] args) {
        Collection<Boolean> avl=new ArrayList<>();

        avl.add(true);
        avl.add(false);
        System.out.println("all product status=="+avl.toString());
        System.out.println("total productos=="+avl.size());

        avl.clear();
        System.out.println("after clearing all products availibility=="+avl.size());
    }
}
