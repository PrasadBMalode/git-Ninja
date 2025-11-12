package com.xworkz.wrapClassTwo.dto;

public class FruitsDto {
    private int price;
    private String fruitName;
    private boolean isThere;
    private Integer weight;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setThere(boolean isThere) {
        this.isThere = isThere;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public String getFruitName() {
        return fruitName;
    }

    public boolean isThere() {
        return isThere;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Price=" + price +
                ", Fruit name=" + fruitName +
                ", Is available=" + isThere +
                ", Fruit weight=" + weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(!(this instanceof Object)) {
            return false;
        }
        FruitsDto fruitsDto= (FruitsDto)obj;
        return this.price==fruitsDto.price && (this.fruitName==null ? fruitsDto.fruitName);

        @Override
        public int hashCode(){
            int primenumber=31;
            int result=1;
            result=primenumber*result+price;
            result=primenumber*result+((fruitName==null)?null:fruitName.hashCode());
            result=primenumber*result+((weight==null)?null:weight.hashCode());
            return result;
        }
    }
}
