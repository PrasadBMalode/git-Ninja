package com.xworkz.collectionFirst.external;

import java.util.ArrayList;
import java.util.Collection;

public class ProductPriceRunner {
    public static void main(String[] args) {
        Collection<Double> productPrice=new ArrayList<>();

        productPrice.add(3.999);
        productPrice.add(4.898);
        System.out.println(productPrice.toString());
        System.out.println("list of products=="+productPrice.size());

        productPrice.clear();
        System.out.println("after clearing products price=="+productPrice.size());
    }
}
