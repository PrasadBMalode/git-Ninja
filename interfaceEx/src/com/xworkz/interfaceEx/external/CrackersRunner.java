package com.xworkz.interfaceEx.external;

import com.xworkz.interfaceEx.implimentation.CrackersImpl;
import com.xworkz.interfaceEx.internal.Crackers;
import com.xworkz.interfaceEx.internal.CrackersDetails;

public class CrackersRunner {
    public static void main(String[] args) {
        CrackersImpl crackersOne=new Crackers();
        CrackersImpl crackersTwo=new CrackersDetails();

        crackersOne.displayCrackersImpl();
        crackersTwo.displayCrackersImpl();



    }
}
