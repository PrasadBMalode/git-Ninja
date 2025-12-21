package com.xworkz.association.manyToMany;

public class Doctor {
    public String doctorName;
    public Appointment appointment;
    public Number number;

    public Doctor(String doctorName,Appointment appointment,Number number){
        this.doctorName=doctorName;
        this.appointment=appointment;
        this.number=number;
    }
    public void displayDoctor(){
        System.out.println("doctor name="+doctorName);
        System.out.println("Appointment details="+appointment.appointmentDay);
        System.out.println("Number details="+number.contectNumber);


    }
}
