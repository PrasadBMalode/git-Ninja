package com.xworkz.password.external;

import com.xworkz.password.dto.PasswordDto;

public class PasswordDtoRunner {
    public static void main(String[] args) {
       PasswordDto passwordDto=new PasswordDto("Prasad@143","Prasad");
       PasswordDto passwordDto1=new PasswordDto("Prasad@143","Prasad");

        System.out.println(passwordDto.toString());

        System.out.println("Password is correct==="+passwordDto.equals(passwordDto1));

    }
}
