package com.xworkz.wrapClassTwo.external;

import com.xworkz.wrapClassTwo.dto.FruitsDto;

public class FruitsDtoRunner {
    public static void main(String[] args) {
        FruitsDto fruitsDto=new FruitsDto();
        fruitsDto.setPrice(120);
        fruitsDto.setFruitName("Apple");
        fruitsDto.setThere(true);
        fruitsDto.setWeight(2);
        System.out.println(fruitsDto.toString());

    }
}
