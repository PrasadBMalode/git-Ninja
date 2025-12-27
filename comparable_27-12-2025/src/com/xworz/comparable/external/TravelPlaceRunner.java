package com.xworz.comparable.external;

import com.xworz.comparable.dto.TravelPlaceDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TravelPlaceRunner {
    public static void main(String[] args) {

        TravelPlaceDto t1 = new TravelPlaceDto(103, "Goa", "India");
        TravelPlaceDto t2 = new TravelPlaceDto(101, "Paris", "France");
        TravelPlaceDto t3 = new TravelPlaceDto(102, "Bali", "Indonesia");

        List<TravelPlaceDto> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);

        Collections.sort(list);

        list.forEach(n -> System.out.println(n));
    }
}