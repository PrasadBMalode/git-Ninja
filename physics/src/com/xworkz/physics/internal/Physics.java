package com.xworkz.physics.internal;

import com.xworkz.physics.event.*;

public class Physics {
    public int cost(int cost){
        if (cost<4000){
            try {
                throw new HighCostException();
            }catch (HighCostException highCostException){
                highCostException.printStackTrace();
                System.out.println("its too expensive ");
            }
        }else {
            System.out.println("its normal cost");
        }
        return cost;
    }

    public boolean book(boolean avl){
        if (avl==true){
            try {
                throw new BookNotFoundException();
            }catch (BookNotFoundException bookNotFoundException){
                bookNotFoundException.printStackTrace();
                System.out.println("book found..");
            }
        }else {
            System.out.println("book not found");
        }
        return avl;
    }

    public String name(String name){
        if(name=="physics"){
            try {
                throw new InvalidReferenceException();
            }catch (InvalidReferenceException invalidReferenceException){
                invalidReferenceException.printStackTrace();
                System.out.println("its a right book");
            }
        }else {
            System.out.println("its not right book");
        }
        return name;
    }

    public boolean version(boolean version){
        if (version==false){
            try {
                throw new OldVersionException();
            }catch (OldVersionException oldVersionException){
                oldVersionException.printStackTrace();
                System.out.println("its old version");
            }
        }else {
            System.out.println("its new version book");
        }
        return version;
    }

    public boolean updated(boolean update){
        if (update==true){
            try {
                throw new UpdatingException();
            }catch (UpdatingException updatingException){
                updatingException.printStackTrace();
                System.out.println("its updated book");
            }
        }else {
            System.out.println("its not updated");
        }
        return update;
    }
}
