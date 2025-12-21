package com.xworkz.association.oneToMany;

public class StudentDetailsRunner {
    public static void main(String[] args) {
        Student student=new Student("prasad", 101);
        College college=new College("Akash","Bengalore",student);
        Library library=new Library("lo1",5,student);
        college.displayCllg();
        library.displayLibrary();
    }
}
