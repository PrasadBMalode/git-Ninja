package com.xworkz.festival.bridge;

import com.xworkz.festival.internal.*;

public class FestivalImpl implements Festival{
    @Override
    public FestivalInfo FestivalName(FestivalInfo festivalInfo) {
        System.out.println("this is sub class" +FestivalInfo.name +FestivalInfo.price);
        return festivalInfo;
    }

    @Override
    public FestivalName Name(FestivalName festivalName) {
        System.out.println("this is 2nd sub class" +FestivalName.number +FestivalName.name);
        return festivalName;
    }

    @Override
    public FestivalTotal Total(FestivalTotal festivalTotal) {
        System.out.println("this is 3rd sub class" +FestivalTotal.price +FestivalTotal.name);
        return festivalTotal;
    }

    @Override
    public FestivalNumber Number(FestivalNumber festivalNumber) {
        System.out.println("this is 4th sub class" +FestivalNumber.name +FestivalNumber.price);
        return festivalNumber;
    }

    @Override
    public FestivalValue Value(FestivalValue festivalValue) {
        System.out.println("this is 5th sub class" +FestivalValue.price +FestivalValue.name);
        return festivalValue;
    }
}
