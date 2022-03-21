package com.itheima.loop;

import com.itheima.atm.Account;

public class ForForDemo9 {
    public static void main(String[] args) {
//        for (int i = 0; i <5; i++) {
//            for (int j = 0; j <3; j++) {
//                System.out.println("love you");
//            }
//            System.out.println("===============");
//        }
//
//        for (int i = 0; i <4; i++) {
//            for (int j = 0; j <5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int S=123;
        int q=123;

        while (true) {
            System.out.println("outside");
            if (S == q) {
                S = 123;
                System.out.println("inside if");

            }

        }


    }
}
