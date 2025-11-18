package com.xworkz.socialMedia.internal;

import com.xworkz.socialMedia.event.InvalidOTPException;

public class OTP {
    public int oTP(int otp){
        if (otp==1234){
            try {
                throw new InvalidOTPException();
            }catch (InvalidOTPException invalidOTPException){
                invalidOTPException.printStackTrace();
                System.out.println("this OTP in valid...");
            }
        }else {
            System.out.println("its a invalid OTP...");
        }
        return otp;
    }
}
