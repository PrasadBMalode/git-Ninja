package com.xworkz.association.manyToOne;

public class Library {
    public String libraryName;
    public int noOfLybrarys;


    public Library(String libraryName, int noOfLybrarys){
        this.libraryName=libraryName;
        this.noOfLybrarys=noOfLybrarys;

    }
    public void displayLibrary(){
        System.out.println("library name=="+libraryName);
        System.out.println("number of librarys=="+noOfLybrarys);

    }
}
