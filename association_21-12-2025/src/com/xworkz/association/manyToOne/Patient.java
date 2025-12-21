package com.xworkz.association.manyToOne;

public class Patient {
    public String patientName;
    public int patientId;
    public Hospital hospital;
    public Doctor doctor;

    public Patient(String patientName, int patientId, Hospital hospital, Doctor doctor) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.hospital = hospital;
        this.doctor = doctor;
    }

    public void displayPatient() {
        System.out.println("Patient name == " + patientName);
        System.out.println("Patient id == " + patientId);
        System.out.println("Hospital name == " + hospital.hospitalName);
        System.out.println("Hospital location == " + hospital.hospitalLocation);
        System.out.println("Doctor name == " + doctor.doctorName);
        System.out.println("Doctor specialization == " + doctor.specialization);
    }
}
