package com.xworkz.association.manyToMany;

public class Patient {
    public String patientName;
    public Appointment appointment;
    public Number number;

    public Patient(String patientName, Appointment appointment,Number number){
        this.patientName=patientName;
        this.appointment=appointment;
        this.number=number;
    }
    public void displayPatient(){
        System.out.println("patient name="+patientName);
        System.out.println("Appointment details="+appointment.appointmentDay);
        System.out.println("Number details="+number.contectNumber);
    }
}
