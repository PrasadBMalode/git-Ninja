package com.xworkz.socialMedia.internal;

import com.xworkz.socialMedia.event.NumberOutOfRangeException;

public class SocialMedia {
    public int numbersOfApp(int apps) {
        if (apps>100) {
            try {
                throw new NumberOutOfRangeException();
            } catch (NumberOutOfRangeException numberOutOfRangeException) {
                numberOutOfRangeException.printStackTrace();
                System.out.println("Ther are too many apps...");
            }

        }else {
            System.out.println("its correct number of apps...");
        }
        return apps;
    }

}
