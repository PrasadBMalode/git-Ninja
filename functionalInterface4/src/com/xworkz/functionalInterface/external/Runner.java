package com.xworkz.functionalInterface.external;

import com.xworkz.functionalInterface.bridge.*;

public class Runner {
    public static void main(String[] args) {

            Addition addition=(a, b) -> a+b;
            int add=addition.add(20,6);
            System.out.println("addition :"+add);

            Sum sum =(a, b) -> a+b;
            long num=sum.sum(2345,98765);
            System.out.println("Sum of a and b :"+num);

            Sub sub = (a, b) -> a-b;
            float minus=sub.sub(23.2f,21.2f);
            System.out.println("Sub :"+minus);

            Subtraction subtractions=(a, b) -> a-b;
            double number = subtractions.subtraction(3421.34,4567.23);
            System.out.println("Subtraction :"+number);

            Multi multi=(num1, num2) -> num1*num2;
            int value=multi.multi(21,23);
            System.out.println("multi :"+value);

            Multiplication multiplication =(a, b) -> a*b;
            long multiplications=multiplication.multiplication(1178899,2212389);
            System.out.println("multiplication :"+multiplications);

            Divide divide = (a, b) -> a/b;
            double divides=divide.divide(6789.34,123.45);
            System.out.println("Divide two number :"+divides);

            Division division =(a, b) -> a/b;
            float divisionNumber = division.division(89.3f,9.3f);
            System.out.println("Division :"+divisionNumber);


            Mod mod=(num1, num2) -> num1%num2;
            int mods=mod.mod(20,2);
            System.out.println("Mod of two number :"+mods);

            Modular modular=(a, b) -> a%b;
            long modulars =modular.modular(34523,98789);
            System.out.println("modular :"+modulars);
    }

}
