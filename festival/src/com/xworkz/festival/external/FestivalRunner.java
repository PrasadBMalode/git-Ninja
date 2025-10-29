package com.xworkz.festival.external;

import com.xworkz.festival.bridge.*;
import com.xworkz.festival.internal.*;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival festival = new FestivalImpl();
        FestivalInfo festivalInfo = new FestivalInfo("deepawali",2000);
        festival.FestivalName(festivalInfo);
        FestivalName festivalName =  new FestivalName(34636478,"ganesha");
        festival.Name(festivalName);
        FestivalTotal festivalTotal= new FestivalTotal(500,"Diwali");
        festival.Total(festivalTotal);
        FestivalNumber festivalNumber = new FestivalNumber("Ganesha",100);
        festival.Number(festivalNumber);
        FestivalValue festivalValue = new FestivalValue(500,"GAnesha");
        festival.Value(festivalValue);
        System.out.println("---------------------------------");

        Name name = new NameImpl();
        FestivalInfo festInfo = new FestivalInfo("deepawali",2000);
        name.FestivalName(festInfo);
        FestivalName festName =  new FestivalName(34636478,"ganesha");
        name.Name(festName);
        FestivalTotal  festTotal= new FestivalTotal(500,"Diwali");
        name.Total(festTotal);
        FestivalNumber festNumber = new FestivalNumber("Ganesha",100);
        name.Number(festNumber);
        FestivalValue festValue = new FestivalValue(500,"GAnesha");
        name.Value(festValue);
        System.out.println("---------------------------------");

        NumberFest numberFest = new NumberFestImpl();
        FestivalInfo festiveInfo = new FestivalInfo("deepawali",2000);
        numberFest.FestivalName(festiveInfo);
        FestivalName festiveName =  new FestivalName(34636478,"ganesha");
        numberFest.Name(festiveName);
        FestivalTotal  festiveTotal= new FestivalTotal(500,"Diwali");
        numberFest.Total(festiveTotal);
        FestivalNumber festiveNumber = new FestivalNumber("Ganesha",100);
        numberFest.Number(festiveNumber);
        FestivalValue festiveValue = new FestivalValue(500,"GAnesha");
        numberFest.Value(festiveValue);
        System.out.println("---------------------------------");

        Value value = new ValueImpl();
        FestivalInfo info = new FestivalInfo("deepawali",2000);
        value.FestivalName(info);
        FestivalName names =  new FestivalName(34636478,"ganesha");
        value.Name(names);
        FestivalTotal  total= new FestivalTotal(500,"Diwali");
        value.Total(total);
        FestivalNumber number = new FestivalNumber("Ganesha",100);
        value.Number(number);
        FestivalValue values = new FestivalValue(500,"GAnesha");
        value.Value(values);
        System.out.println("---------------------------------");

        Total total1 = new TotalImpl();
        FestivalInfo infoFest = new FestivalInfo("deepawali",2000);
        total1.FestivalName(infoFest);
        FestivalName nameFest =  new FestivalName(34636478,"ganesha");
        total1.Name(nameFest);
        FestivalTotal totalFest = new FestivalTotal(500,"Diwali");
        total1.Total(totalFest);
        FestivalNumber numbersFest = new FestivalNumber("Ganesha",100);
        total1.Number(numbersFest);
        FestivalValue valueFest = new FestivalValue(500,"GAnesha");
        total1.Value(valueFest);
        System.out.println("---------------------------------");






    }
}
