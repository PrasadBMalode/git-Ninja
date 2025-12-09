package com.xworkz.java_Practice.external;

public class MethodOverloading {
    public void displayStudent(String name){
        System.out.println(name);
    }
    public void displayStudent(String name,int id){
        System.out.println(name);
        System.out.println(id);
    }
    public void displayStudent(String name,int id,long number){
        System.out.println(name);
        System.out.println(id);
        System.out.println(number);
    }
    public void displayStudent(String name,int id,long number,char grade){
        System.out.println(name);
        System.out.println(id);
        System.out.println(number);
        System.out.println(grade);
    }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.displayStudent("Rahul");
        obj.displayStudent("Rahul", 101);
        obj.displayStudent("Rahul", 101, 9876543210L);
        obj.displayStudent("Rahul", 101, 9876543210L, 'A');

    }

}
