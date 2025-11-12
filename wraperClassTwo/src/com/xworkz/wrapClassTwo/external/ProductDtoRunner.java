package com.xworkz.wrapClassTwo.external;

import com.xworkz.wrapClassTwo.dto.ProductDto;

public class ProductDtoRunner {
    public static void main(String[] args) {
        ProductDto product=new ProductDto();
        product.setId(101);
        product.setSeries(9876543210L);
        product.setRating(4.5f);
        product.setPrice(2999.99);
        product.setAvailable(true);
        product.setType('A');


        product.setProductId(202);
        product.setProductSeries(1234567890L);
        product.setProductRating(4.8f);
        product.setProductPrice(3999.49);
        product.setProductIsAvailable(Boolean.TRUE);
        product.setProductType('B');


        System.out.println(product.toString());
    }
}
