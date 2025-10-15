package com.xworkz.protectedModifier.external;

import com.xworkz.protectedModifier.internal.ProtectedExample;

public class ProtectedRunner extends ProtectedExample {
    public static void main(String[] args) {
        ProtectedRunner protectedRunner=new ProtectedRunner();
        System.out.println(protectedRunner.price);
        System.out.println(protectedRunner.productName);
    }

}
