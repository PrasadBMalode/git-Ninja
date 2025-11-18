package com.xworkz.socialMedia.internal;

import com.xworkz.socialMedia.event.InvalidPasswordException;

public class Password {
    public String password(String password){
        if (password=="Prasad@143"){
            try {
                throw new InvalidPasswordException();
            }catch (InvalidPasswordException invalidPasswordException){
                invalidPasswordException.printStackTrace();
                System.out.println("its valid password...");
            }
        }else {
            System.out.println("its inValid password...");
        }
        return password;
    }
}
