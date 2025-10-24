package com.xworkz.association.internal;

public class Person {
    public String name;
    public boolean isIndian;
    public AddharCard addharCard;

    public Person(String name, boolean isIndian, AddharCard addharCard){
        this.name=name;
        this.isIndian=isIndian;
        this.addharCard=addharCard;
    }

    public void displayPerson(){
        System.out.println("person name=="+name);
        System.out.println("person is an indian="+isIndian);
        System.out.println("Addhar card details="+addharCard.addharIsMaditory);
    }
}
