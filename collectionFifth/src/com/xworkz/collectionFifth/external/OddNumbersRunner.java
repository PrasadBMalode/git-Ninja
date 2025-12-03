package com.xworkz.collectionFifth.external;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersRunner {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> stream=data.stream()
                .sorted()
                .filter(n-> n%2!=0)
                .collect(Collectors.toList());
        stream.forEach(n-> System.out.println(n));
    }
}
