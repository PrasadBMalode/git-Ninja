package com.xworkz.association.manyToMany;

public class LibraryRunner {
    public static void main(String[] args) {

        Visit visit = new Visit("12-12-2025");
        Contect contact = new Contect(9123456789L);

        Librarian librarian = new Librarian("Anil", visit, contact);
        Member member = new Member("Kiran", visit, contact);

        librarian.displayLibrarian();
        member.displayMember();
    }
}
