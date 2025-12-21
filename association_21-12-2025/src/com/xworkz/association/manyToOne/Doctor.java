package com.xworkz.association.manyToOne;

public class Doctor {
    public String doctorName;
    public String specialization;

    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public void displayDoctor() {
        System.out.println("Doctor name == " + doctorName);
        System.out.println("Specialization == " + specialization);
    }
}
