package com.xworkz.exceptions.external;

import com.xworkz.exceptions.events.InvalidAge;
import com.xworkz.exceptions.internal.Problem;

public class AgeRunner {
    public static void main(String[] args) throws InvalidAge {
        Problem problem=new Problem();
        problem.checkAge(14);

    }
}
