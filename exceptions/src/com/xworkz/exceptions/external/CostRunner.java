package com.xworkz.exceptions.external;

import com.xworkz.exceptions.events.HighCostException;
import com.xworkz.exceptions.internal.Problem2;

public class CostRunner {
    public static void main(String[] args) throws HighCostException {
        Problem2 problem2=new Problem2();
        problem2.checkPrice(9999);

    }
}
