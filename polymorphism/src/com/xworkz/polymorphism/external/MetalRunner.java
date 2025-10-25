package com.xworkz.polymorphism.external;

import com.xworkz.polymorphism.internal.Gold;
import com.xworkz.polymorphism.internal.Metal;
import com.xworkz.polymorphism.internal.Silver;

public class MetalRunner {
    public static void main(String[] args) {
        Metal metalFirst=new Silver(true);
        Metal metalSecond=new Gold(true,"Gold",65.897,987654321);

        metalFirst.displayMetal();
        metalSecond.displayMetal();

        Gold gold=new Gold(true,"Gold",65.897,987654321);
        gold.displayGold();
        gold.gold();

        Silver silver=new Silver(true);
        silver.displaySilver();
        silver.silver();
        silver.SilverMethod(true,'S',9.9f);

        gold.goldMethod();

        new Silver();



    }
}
