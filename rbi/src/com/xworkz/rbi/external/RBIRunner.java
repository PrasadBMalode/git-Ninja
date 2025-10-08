package com.xworkz.rbi.external;

import com.xworkz.rbi.internal.KVG;
import com.xworkz.rbi.internal.SBI;

public class RBIRunner {
    public static void main(String[] args) {


        KVG kvg=new KVG();
        kvg.displayKVGBank();

        SBI sbi=new SBI();
        sbi.displaySBIBank();

        sbi.displayRBIBank();









    }
}
