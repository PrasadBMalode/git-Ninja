package com.xworkz.socialMedia.internal;

import com.xworkz.socialMedia.event.InvalidPhoneNumberException;

public class PhoneNumber {
    public int phoneNumber(int number){
        if(number>=10){
            try {
                throw new InvalidPhoneNumberException();
            }catch (InvalidPhoneNumberException invalidPhoneNumberException){
                invalidPhoneNumberException.printStackTrace();
                System.out.println("correct digits of phone number...");
            }
        }else {
            System.out.println("InCorrect number digits of phone number");
        }
        return number;
    }
}
