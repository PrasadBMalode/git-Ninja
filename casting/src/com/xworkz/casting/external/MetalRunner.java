package com.xworkz.casting.external;

import com.xworkz.casting.internal.Gold;
import com.xworkz.casting.internal.Metal;

public class MetalRunner {
    public static void main(String[] args) {
        Metal metal=new Gold();
        metal.displayMetal();

        Gold gold=(Gold) metal;
        gold.displayGold();
    }
}
