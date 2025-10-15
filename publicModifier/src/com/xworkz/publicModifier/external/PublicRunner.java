package com.xworkz.publicModifier.external;

import com.xworkz.publicModifier.internal.PublicExample;

public class PublicRunner {
    public static void main(String[] args) {
        PublicExample publicExample=new PublicExample();
        System.out.println(publicExample.product);
        System.out.println(publicExample.price);
    }
}
