package com.xworkz.java_Practice.external;

public class MethodOverriddingRunner {
    public static void main(String[] args) {
//        MethodOverriddingChildClass child=new MethodOverriddingChildClass();
//        child.displayName();
//        child.displayId();

        System.out.println("-----------------------");
        MethodOverriddingParentClass parentChild=new MethodOverriddingChildClass();
        parentChild.displayName();
        parentChild.displayId();

//        System.out.println("-----------------------");
//        MethodOverriddingParentClass parent=new MethodOverriddingParentClass();
//        parent.displayName();
//        parent.displayId();
    }

}
