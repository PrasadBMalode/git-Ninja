package com.xworkz.association.manyToOne;

public class College {
    public String cllgName;
    public String cllgLocaton;


    public College(String cllgName, String cllgLocaton){
        this.cllgName=cllgName;
        this.cllgLocaton=cllgLocaton;

    }
    public void displayCllg(){
        System.out.println("cllg name=="+cllgName);
        System.out.println("cllg location=="+cllgLocaton);

    }
}
