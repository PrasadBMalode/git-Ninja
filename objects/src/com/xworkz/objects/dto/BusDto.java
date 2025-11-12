package com.xworkz.objects.dto;

import java.util.Objects;

public class BusDto {
    private int id;
    private int price;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

 @Override
    public String toString(){
        return "id="+id+"price="+price+"name="+name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusDto)) return false;
        BusDto busDto = (BusDto) o;
        return id == busDto.id && price == busDto.price && Objects.equals(name, busDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, name);
    }

    public BusDto(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
}
