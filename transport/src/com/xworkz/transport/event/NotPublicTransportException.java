package com.xworkz.transport.event;

public class NotPublicTransportException extends Exception{
    public NotPublicTransportException(){
        System.err.println("its a NotPublicTransportException");
    }
}
