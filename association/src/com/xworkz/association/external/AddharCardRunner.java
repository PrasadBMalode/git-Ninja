package com.xworkz.association.external;

import com.xworkz.association.internal.AddharCard;
import com.xworkz.association.internal.Person;

public class AddharCardRunner {
    public static void main(String[] args) {
        AddharCard addharCard=new AddharCard(true);
        Person person=new Person("PRASAD",true,addharCard);
        person.displayPerson();

    }
}
