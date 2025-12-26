package com.xworkz.streamAPI.outer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List <Integer> stream=data.stream()
                .sorted()
                .filter(n->n% 2==0)
                .collect(Collectors.toList());

        System.out.println("Even numbers");
        stream.forEach(n-> System.out.println(n));
    }
}
