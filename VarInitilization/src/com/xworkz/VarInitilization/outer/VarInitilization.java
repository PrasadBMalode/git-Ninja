package com.xworkz.VarInitilization.outer;

public class VarInitilization {
    int a;
    VarInitilization(int a) {
            this.a = a;
        }
        static int getValue() {
            return 30;
        }
        public static void main(String[] args) {
            int a = 10;
            int b = a;
            int c = getValue();
            VarInitilization obj = new VarInitilization(50);

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(obj.a);
        }
    }
