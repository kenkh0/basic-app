package com.p155_recuion;

import java.util.Scanner;

public class RecursionDemo01 {
    public static void main(String[] args) {

        System.out.println(f(1));
        System.out.println(f1(10));
    }

    private static int f(int n) {
        if(n==10){
            return 1;
        }else {
            return   2*f(n+1)+2;
        }
    }

    /*
    f(x) -f(x)/2 -1 = f(x+1)
            2f(x) -f(x) -2 =2f(x+1)
            f(x)=2f(x+1)+2
     */
    private static int f1(int n) {
        if(n==1){
            return 1;
        }else {
            return   2* f1(n-1)+2;
//            return   f1(n-1)*n;
//            return   n*f1(n-1);
        }
    }
}
