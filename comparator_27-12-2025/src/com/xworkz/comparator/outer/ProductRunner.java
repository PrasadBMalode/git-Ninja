package com.xworkz.comparator.outer;

import com.xworkz.comparator.dto.ProductDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRunner {
    public static void main(String[] args) {
        ProductDto product1=new ProductDto("Bag",1200);
        ProductDto product2=new ProductDto("Shoes",899);
        ProductDto product3=new ProductDto("Shirt",499);
        ProductDto product4=new ProductDto("Pant",999);

        List<ProductDto> list=new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);

        Comparator<ProductDto> comparator=(a,b)->b.getProductPrice()-a.getProductPrice();

        list.sort(comparator);
        list.forEach(n-> System.out.println(n));
    }
}
