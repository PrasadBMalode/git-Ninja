package com.xworkz.association.manyToMany;

public class Member {
    public String memberName;
    public Visit visit;
    public Contect contact;

    public Member(String memberName, Visit visit, Contect contact) {
        this.memberName = memberName;
        this.visit = visit;
        this.contact = contact;
    }

    public void displayMember() {
        System.out.println("Member Name = " + memberName);
        System.out.println("Visit Date = " + visit.visitDate);
        System.out.println("Contact Number = " + contact.mobileNumber);
    }
}
