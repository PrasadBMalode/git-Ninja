package com.xworkz.java_Practice.external;

public class ConstructorChaining_This {
    public ConstructorChaining_This(){
        this("Prasad");
    }
    public ConstructorChaining_This(String name){
        this("Prasad",101);
    }
    public ConstructorChaining_This(String name,int id){
        this("Prasad",101,'A');
    }
    public ConstructorChaining_This(String name,int id,char grade){
        System.out.println(name);
        System.out.println(id);
        System.out.println(grade);
    }

    public static void main(String[] args) {
        new ConstructorChaining_This();
    }
}
