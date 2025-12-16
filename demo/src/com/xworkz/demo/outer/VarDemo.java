package com.xworkz.demo.outer;

public class VarDemo {
    static int staticVar=100;
    int instatnceVar=200;

     VarDemo(int parameterVar){
        int localVar=300;
        int a=localVar;

         System.out.println(staticVar);
         System.out.println(instatnceVar);
         System.out.println(localVar);
         System.out.println(parameterVar);

    }

    public static void main(String[] args) {
        VarDemo varDemo=new VarDemo(400);

    }
}
