package com.xworkz.wrapClass.external;

import com.xworkz.wrapClass.bridge.ProductDto;

public class Runner {
    public static void main(String[] args) {
        ProductDto productDto=new ProductDto();
        productDto.setPrice(100);
        int price=productDto.getPrice();
        System.out.println(price);

        Integer integer=new Integer(120);
        int number=integer.intValue();
        System.out.println("converted Integer class to int==="+number);

        int value=Integer.sum(30,60);
        System.out.println("sum of a and b==="+value);

        int val=Integer.parseInt("300");
        System.out.println("converted string to int==="+val);


    }
}
