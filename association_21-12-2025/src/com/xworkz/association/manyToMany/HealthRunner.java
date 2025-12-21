package com.xworkz.association.manyToMany;

public class HealthRunner {
    public static void main(String[] args) {
        Appointment appointment = new Appointment("Monday");
        Number number = new Number(6360211265l);

        Doctor doctor=new Doctor("Harish",appointment,number);
        Patient patient=new Patient("Prasad",appointment,number);

        doctor.displayDoctor();
        patient.displayPatient();


    }
}
