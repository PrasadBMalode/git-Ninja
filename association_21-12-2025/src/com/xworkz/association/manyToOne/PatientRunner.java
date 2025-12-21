package com.xworkz.association.manyToOne;

public class PatientRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("CityCare", "Mysore");
        Doctor doctor = new Doctor("Dr. Ramesh", "Cardiology");
        Patient patient = new Patient("Kiran", 301, hospital, doctor);

        patient.displayPatient();
    }
}
