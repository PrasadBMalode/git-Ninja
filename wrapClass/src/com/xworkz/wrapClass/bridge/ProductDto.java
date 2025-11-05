package com.xworkz.wrapClass.bridge;

public class ProductDto {
    private Integer price;
    private String name;

    public void setPrice(Integer price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
