package com.xworkz.restaurent.external;

import com.xworkz.restaurent.dto.ProductDto;

public class ProductRunner {

        public static void main(String[] args) {
            ProductDto productDto =new ProductDto();

            productDto.setProductName("Tent");
            String name=productDto.getProductName();
            System.out.println("Product name==="+name);

            productDto.setPrice(9999);
            int price=productDto.getPrice();
            System.out.println("product price==="+price);

            productDto.setSeriesNumber(987654567l);
            long number=productDto.getSeriesNumber();
            System.out.println("product series==="+number);

            productDto.setRanking(8.9f);
            float ranking=productDto.getRanking();
            System.out.println("product ranking==="+ranking);

            productDto.setActuelPrice(14.999);
            double actulePrice=productDto.getActuelPrice();
            System.out.println("product Actule price==="+actulePrice);

            productDto.setProductType('M');
            char type=productDto.getProductType();
            System.out.println("metal type product==="+type);
        }
    }


