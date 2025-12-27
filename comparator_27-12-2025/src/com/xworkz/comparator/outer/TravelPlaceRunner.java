package com.xworkz.comparator.outer;

import com.xworkz.comparator.dto.TravelPlaceDto;

import java.util.ArrayList;
import java.util.Comparator;
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

        Comparator<TravelPlaceDto> comparator =(a, b) -> a.getPlaceName().compareTo(b.getPlaceName());

        list.sort(comparator);

        list.forEach(n -> System.out.println(n));
    }
}
