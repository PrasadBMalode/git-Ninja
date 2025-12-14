package com.xworkz.collectionSeventh.external;
import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101,"Prasad");
        map.put(102,"Priya");
        map.put(103,"Sai");
        map.put(104,"Hema");

        System.out.println(map.get(102));
        System.out.println(map.get(101));
    }
}
