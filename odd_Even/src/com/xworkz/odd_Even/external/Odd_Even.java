package com.xworkz.odd_Even.external;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for checking: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " This Given number is even.");
        } else {
            System.out.println(num + " This  Given number is odd.");
        }

        sc.close();
    }
}
