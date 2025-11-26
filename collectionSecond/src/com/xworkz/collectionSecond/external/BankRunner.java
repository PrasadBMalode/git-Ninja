package com.xworkz.collectionSecond.external;

import com.xworkz.collectionSecond.dto.BankDto;
import com.xworkz.collectionSecond.dto.CollegeBusDto;

import java.util.ArrayList;
import java.util.List;

public class BankRunner {

    public static void main(String[] args) {
        List<BankDto> bank=new ArrayList<>();

        BankDto bankDto=new BankDto("SBIBank",'P',111,"Prasad",8.9f,987654321234l,78.999,3,2,true);
        BankDto bankDto1  = new BankDto("SBIBank", 'P', 111, "Prasad", 8.9f, 987654321234l, 78.999, 3, 2, true);
        BankDto bankDto2  = new BankDto("HSBC", 'S', 112, "Rahul", 7.5f, 987654321235l, 45.120, 4, 1, false);
        BankDto bankDto3  = new BankDto("ICICIBank", 'C', 113, "Asha", 9.1f, 987654321236l, 12.457, 5, 3, true);
        BankDto bankDto4  = new BankDto("HDFCBank", 'P', 114, "Meena", 6.8f, 987654321237l, 98.640, 2, 4, false);
        BankDto bankDto5  = new BankDto("AxisBank", 'S', 115, "Vijay", 8.2f, 987654321238l, 33.765, 1, 2, true);

        BankDto bankDto6  = new BankDto("KotakBank", 'C', 116, "Neha", 7.9f, 987654321239l, 87.445, 6, 1, false);
        BankDto bankDto7  = new BankDto("YesBank", 'P', 117, "Suresh", 8.7f, 987654321240l, 23.980, 7, 3, true);
        BankDto bankDto8  = new BankDto("CanaraBank", 'S', 118, "Rita", 7.1f, 987654321241l, 56.890, 8, 4, false);
        BankDto bankDto9  = new BankDto("IDFGBank", 'C', 119, "Gopi", 9.0f, 987654321242l, 10.765, 9, 2, true);
        BankDto bankDto10 = new BankDto("BOIBank", 'P', 120, "Swati", 6.5f, 987654321243l, 91.450, 10, 1, false);

        BankDto bankDto11 = new BankDto("PNBBank", 'S', 121, "Anil", 7.8f, 987654321244l, 65.780, 3, 2, true);
        BankDto bankDto12 = new BankDto("UBIBank", 'C', 122, "Kiran", 9.3f, 987654321245l, 44.220, 4, 1, false);
        BankDto bankDto13 = new BankDto("CentralBank", 'P', 123, "Mahesh", 8.4f, 987654321246l, 29.347, 5, 3, true);
        BankDto bankDto14 = new BankDto("IndianBank", 'S', 124, "Sneha", 7.0f, 987654321247l, 99.123, 6, 4, false);
        BankDto bankDto15 = new BankDto("KarurVysya", 'C', 125, "Harish", 8.8f, 987654321248l, 11.430, 7, 2, true);

        BankDto bankDto16 = new BankDto("CityBank", 'P', 126, "Divya", 9.2f, 987654321249l, 88.111, 8, 1, false);
        BankDto bankDto17 = new BankDto("DBSBank", 'S', 127, "Rohan", 6.9f, 987654321250l, 47.957, 9, 3, true);
        BankDto bankDto18 = new BankDto("RBLBank", 'C', 128, "Varsha", 8.6f, 987654321251l, 20.670, 10, 4, false);
        BankDto bankDto19 = new BankDto("IndusIndBank", 'P', 129, "Keshav", 7.7f, 987654321252l, 54.233, 3, 2, true);
        BankDto bankDto20 = new BankDto("UCOBank", 'S', 130, "Pooja", 9.4f, 987654321253l, 73.490, 4, 1, false);

        BankDto bankDto21 = new BankDto("SyndicateBank", 'C', 131, "Ajay", 8.1f, 987654321254l, 16.890, 5, 3, true);
        BankDto bankDto22 = new BankDto("AndhraBank", 'P', 132, "Leela", 7.3f, 987654321255l, 62.124, 6, 4, false);
        BankDto bankDto23 = new BankDto("SBIBank", 'S', 133, "Nitin", 8.5f, 987654321256l, 36.450, 7, 2, true);
        BankDto bankDto24 = new BankDto("HDFCBank", 'C', 134, "Priya", 9.6f, 987654321257l, 25.764, 8, 1, false);
        BankDto bankDto25 = new BankDto("ICICIBank", 'P', 135, "Tejas", 7.4f, 987654321258l, 70.230, 9, 3, true);

        BankDto bankDto26 = new BankDto("AxisBank", 'S', 136, "Lavanya", 8.3f, 987654321259l, 12.660, 10, 4, false);
        BankDto bankDto27 = new BankDto("KotakBank", 'C', 137, "Rakesh", 9.7f, 987654321260l, 95.450, 3, 2, true);
        BankDto bankDto28 = new BankDto("YesBank", 'P', 138, "Monica", 6.7f, 987654321261l, 41.882, 4, 1, false);
        BankDto bankDto29 = new BankDto("CanaraBank", 'S', 139, "Sanjay", 8.0f, 987654321262l, 84.399, 5, 3, true);
        BankDto bankDto30 = new BankDto("BOIBank", 'C', 140, "Geeta", 9.8f, 987654321263l, 18.520, 6, 4, false);

        bank.add(bankDto1);
        bank.add(bankDto2);
        bank.add(bankDto3);
        bank.add(bankDto4);
        bank.add(bankDto5);
        bank.add(bankDto6);
        bank.add(bankDto7);
        bank.add(bankDto8);
        bank.add(bankDto9);
        bank.add(bankDto10);
        bank.add(bankDto11);
        bank.add(bankDto12);
        bank.add(bankDto13);
        bank.add(bankDto14);
        bank.add(bankDto15);
        bank.add(bankDto16);
        bank.add(bankDto17);
        bank.add(bankDto18);
        bank.add(bankDto19);
        bank.add(bankDto20);
        bank.add(bankDto21);
        bank.add(bankDto22);
        bank.add(bankDto23);
        bank.add(bankDto24);
        bank.add(bankDto25);
        bank.add(bankDto26);
        bank.add(bankDto27);
        bank.add(bankDto28);
        bank.add(bankDto29);
        bank.add(bankDto30);

        for (BankDto dto:bank){
            System.out.println(bank);
        }

        bank.forEach(n-> System.out.println(n));


    }
}
