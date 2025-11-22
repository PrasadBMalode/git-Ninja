package com.xworkz.exceptionHandling.external;

import com.xworkz.exceptionHandling.dto.AplicationDto;
import com.xworkz.exceptionHandling.internal.OnlineAplication;

public class OnlineApplicationRunner {
    public static void main(String[] args) {
        OnlineAplication onlineAplication=new OnlineAplication();
        AplicationDto aplicationDto=new AplicationDto(5.00d,22,"prasd@123gmail.com",6360211265l,"Prasad@123",9.30d,12,888,"male","credited");
        onlineAplication.saveOperation(aplicationDto);

    }
}
