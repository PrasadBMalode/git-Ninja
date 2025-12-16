package com.xworkz.ticketPrice.outer;

class VarInitialization {
    int a;
    VarInitialization(int a) {
        this.a = a;
    }

    static int getValue() {
        return 30;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = a;
        int c = getValue();
        VarInitialization obj = new VarInitialization(50);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(obj.a);
    }
}
