package com.xworkz.collectionFifth.external;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersRunner {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(8,6,12,13,15,18,22,4);
        List<Integer> stream=data.stream()
                .filter(n-> n% 2==0)
                .sorted()
                .collect(Collectors.toList());
        stream.forEach(n-> System.out.println(n));
    }
}
