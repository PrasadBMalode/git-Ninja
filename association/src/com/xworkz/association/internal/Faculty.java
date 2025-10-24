package com.xworkz.association.internal;

public class Faculty {
    public int numberOfFaculty;
    public boolean good;

    public Faculty(int numberOfFaculty, boolean good){
        this.numberOfFaculty=numberOfFaculty;
        this.good=good;
    }

    public void displayFaculty(){
        System.out.println("number of faculty="+numberOfFaculty);
        System.out.println("are good"+good);
    }
}
