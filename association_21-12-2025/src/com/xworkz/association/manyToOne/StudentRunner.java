package com.xworkz.association.manyToOne;

public class StudentRunner {
    public static void main(String[] args) {
        College college=new College("RTES cllg","Ranebennur");
        Library library=new Library("Rt01",2);
        Student student=new Student("Sai",1023,college,library);

        student.displayStudent();
    }
}
