package com.xworkz.exception.outer;

import com.xworkz.exception.internal.CustomeException;

public class CustomeExceptionRunner {
    public static void main(String[] args) {
        CustomeException obj=new CustomeException();

        obj.storage(30);
        obj.cost(44.999d);
        obj.inbuilt("inbuilt");
        obj.id(102);
        obj.address("location");
        obj.location("haveri");
        obj.network("30mbps");
        obj.strength("powerfull");
        obj.name("kumar");
        obj.Authorize("Avinash");
    }
}
