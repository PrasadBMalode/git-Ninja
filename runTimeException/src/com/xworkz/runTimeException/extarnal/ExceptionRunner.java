package com.xworkz.runTimeException.extarnal;


import com.xworkz.runTimeException.event.Problem;

public class ExceptionRunner {
    public static void main(String[] args) {
        Problem problem=new Problem();
//        problem.problem1();
//        problem.problem2();

//        try {
//            problem.problem1();
//        } catch (ArithmeticException e) {
//            System.out.println("Caught ArithmeticException");
//        }
//        try {
//            problem.problem2();
//        } catch (ClassCastException e) {
//            System.out.println("Caught ClassCastException");
//        }
        Thread t1 = new Thread(() -> problem.problem1());
        t1.start();
        Thread t2 = new Thread(() -> problem.problem2());
        t2.start();
        Thread t3=new Thread(()-> problem.problem3());
        t3.start();
        Thread t4=new Thread(()-> problem.problem4());
        t4.start();
        Thread t6 = new Thread(() -> problem.problem6());
        t6.start();
        Thread t7 = new Thread(() -> problem.problem7());
        t7.start();
        Thread t8 = new Thread(() -> problem.problem8());
        t8.start();
        Thread t9 = new Thread(() -> problem.problem9());
        t9.start();
        Thread t10 = new Thread(() -> problem.problem10());
        t10.start();
        Thread t11 = new Thread(() -> problem.problem11());
        t11.start();
        Thread t12 = new Thread(() -> problem.problem12());
        t12.start();
        Thread t13 = new Thread(() -> problem.problem13());
        t13.start();
        Thread t14 = new Thread(() -> problem.problem14());
        t14.start();
        Thread t15 = new Thread(() -> problem.problem15());
        t15.start();
        Thread t16 = new Thread(() -> problem.problem16());
        t16.start();
        Thread t17 = new Thread(() -> problem.problem17());
        t17.start();
        Thread t18 = new Thread(() -> problem.problem18());
        t18.start();
        Thread t19 = new Thread(() -> problem.problem19());
        t19.start();
        Thread t20 = new Thread(() -> problem.problem20());
        t20.start();
        Thread t21 = new Thread(() -> problem.problem21());
        t21.start();
        Thread t22 = new Thread(() -> problem.problem22());
        t22.start();
        Thread t23 = new Thread(() -> problem.problem23());
        t23.start();
        Thread t24 = new Thread(() -> problem.problem24());
        t24.start();
        Thread t25 = new Thread(() -> problem.problem25());
        t25.start();
        Thread t26 = new Thread(() -> problem.problem26());
        t26.start();
        Thread t27 = new Thread(() -> problem.problem27());
        t27.start();
        Thread t28 = new Thread(() -> problem.problem28());
        t28.start();
        Thread t29 = new Thread(() -> problem.problem29());
        t29.start();
        //        Thread t30 = new Thread(() -> problem.problem30());
        //        t30.start();
        Thread t31 = new Thread(() -> problem.problem31());
        t31.start();
        Thread t32 = new Thread(() -> problem.problem32());
        t32.start();
        Thread t33 = new Thread(() -> problem.problem33());
        t33.start();
        Thread t34 = new Thread(() -> problem.problem34());
        t34.start();
        Thread t35 = new Thread(() -> problem.problem35());
        t35.start();
        Thread t36 = new Thread(() -> problem.problem36());
        t36.start();
        Thread t37 = new Thread(() -> problem.problem37());
        t37.start();
        Thread t38 = new Thread(() -> problem.problem38());
        t38.start();
        Thread t39 = new Thread(() -> problem.problem39());
        t39.start();
        Thread t40 = new Thread(() -> problem.problem40());
        t40.start();
        Thread t41 = new Thread(() -> problem.problem41());
        t41.start();
        Thread t42 = new Thread(() -> problem.problem42());
        t42.start();
        Thread t43 = new Thread(() -> problem.problem43());
        t43.start();
        Thread t44 = new Thread(() -> problem.problem44());
        t44.start();

        //        Thread t45 = new Thread(() -> problem.problem45());
        //        t45.start();
        Thread t46 = new Thread(() -> problem.problem46());
        t46.start();
        Thread t47 = new Thread(() -> problem.problem47());
        t47.start();
        Thread t48 = new Thread(() -> problem.problem48());
        t48.start();
        //       Thread t49 = new Thread(() -> problem.problem49());//        t49.start();
        Thread t50 = new Thread(() -> problem.problem50());
        t50.start();
        Thread t51 = new Thread(() -> problem.problem51());
        t51.start();
        Thread t52 = new Thread(() -> problem.problem52());
        t52.start();

    }


}
