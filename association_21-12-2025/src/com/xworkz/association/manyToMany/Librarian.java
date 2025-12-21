package com.xworkz.association.manyToMany;

public class Librarian {
    public String librarianName;
    public Visit visit;
    public Contect contact;

    public Librarian(String librarianName, Visit visit, Contect contact) {
        this.librarianName = librarianName;
        this.visit = visit;
        this.contact = contact;
    }

    public void displayLibrarian() {
        System.out.println("Librarian Name = " + librarianName);
        System.out.println("Visit Date = " + visit.visitDate);
        System.out.println("Contact Number = " + contact.mobileNumber);
    }
}
