package com.xworkz.collectionFifth.external;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneNumberRunner {
    public static void main(String[] args) {
        List<String> number= Arrays.asList("9360211265l", "7760211265l", "8879645362l",
                                           "9578654687l","9876543234l","8787675465l",
                                           "9899876545l");
        List<String> stream=number.stream()
                .sorted()
                .filter(num->num.startsWith("9"))
                .collect(Collectors.toList());
        stream.forEach(n-> System.out.println(n));
    }
}






