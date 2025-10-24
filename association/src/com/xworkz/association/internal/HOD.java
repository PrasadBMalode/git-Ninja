package com.xworkz.association.internal;

public class HOD {
    public String hodName;
    public String department;

    public HOD(String hodName, String department){
        this.hodName=hodName;
        this.department=department;
    }

    public void displayHOD(){
        System.out.println("HOD name="+hodName);
        System.out.println("HOD department="+department);
    }
}
