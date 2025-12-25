package com.xworkz.exception.internal;

import com.xworkz.exception.customEvent.*;

public class CustomeException {
    public int storage(int storage) {
        if (storage < 32) {
            try {
                throw new EnoughStorageException();
            } catch (EnoughStorageException enoughStorageException) {
                enoughStorageException.printStackTrace();

            }
        } else {
            System.out.println("perfect storage");
        }
        return storage;
    }

    public double cost(double cost){
        if (cost>23.999d){
            try {
                throw new HighCostException();
            }catch (HighCostException highCostException){
                highCostException.printStackTrace();
            }
        }
        return cost;
    }

    public String inbuilt(String inbuilt){
        if (inbuilt=="inbuilt"){
            try {
                throw new InbuiltProblemException();
            }catch (InbuiltProblemException inbuiltProblemException){
                inbuiltProblemException.printStackTrace();
            }
        }
        return inbuilt;
    }

    public  int id(int id){
        if (id!=101){
            try {
                throw new Invalid_IdException();
            }catch (Invalid_IdException invalidIdException){
                invalidIdException.printStackTrace();
            }
        }
        return id;
    }

    public String address(String address){
        if (address!="address"){
            try {
                throw new InvalidAddressException();
            }catch (InvalidAddressException invalidAddressException){
                invalidAddressException.printStackTrace();
            }
        }
        return address;
    }

    public String location(String location){
        if (location!="bangalore"){
            try {
                throw  new InvalidLocationException();
            }catch (InvalidLocationException invalidLocationException){
                invalidLocationException.printStackTrace();
            }
        }
        return location;
    }

    public String network(String network){
        if (network!="50mbps"){
            try {
                throw new LowNetworkException();
            }catch (LowNetworkException lowNetworkException){
                lowNetworkException.printStackTrace();
            }
        }
        return network;
    }

    public String strength(String strength){
        if (strength!="strength"){
            try {
                throw new LowStrengthException();
            }catch (LowStrengthException lowStrengthException){
                lowStrengthException.printStackTrace();
            }
        }
        return strength;
    }

    public String name(String name){
        if (name!="prasad"){
            try {
                throw new NameNotMatchingException();
            }catch (NameNotMatchingException nameNotMatchingException){
                nameNotMatchingException.printStackTrace();
            }
        }
        return name;
    }

    public String Authorize(String authorize){
        if (authorize!="prasad"){
            try {
                throw new UnAuthorizedException();
            }catch (UnAuthorizedException unAuthorizedException){
                unAuthorizedException.printStackTrace();
            }

        }
        return authorize;
    }
}
