package com.xworkz.socialMedia.internal;

import com.xworkz.socialMedia.event.InvalidUserNameException;

public class UserName {
    public String userName(String name){
        if (name=="Prasad"){
            try {
                throw new InvalidUserNameException();
            }catch (InvalidUserNameException invalidUserNameException){
                invalidUserNameException.printStackTrace();
                System.out.println("it correct user name...");
            }
        }else {
            System.out.println("its a wrong user name...");
        }
        return name;
    }
}
