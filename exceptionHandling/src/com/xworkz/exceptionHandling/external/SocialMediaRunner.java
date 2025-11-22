package com.xworkz.exceptionHandling.external;

import com.xworkz.exceptionHandling.dto.FormDto;
import com.xworkz.exceptionHandling.internal.SocialMediaApp;

public class SocialMediaRunner {
    public static void main(String[] args) {
        SocialMediaApp socialMediaApp=new SocialMediaApp();
        FormDto formDto=new FormDto(20,"prasadbm66@gmail.com",6360211265l,"Prasad@123",5.00f,10.00f,19,999,true,true);
        socialMediaApp.validate(formDto);
    }
}
