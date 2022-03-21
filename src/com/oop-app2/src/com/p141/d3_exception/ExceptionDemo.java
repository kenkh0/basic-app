package com.p141.d3_exception;

import java.util.Objects;

public class ExceptionDemo {
    public static void main(String[] args) {
        int [] arr= {10,20,30};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]);

        System.out.println("error");

        String name =null;
        System.out.println(name);
//        System.out.println(name.length());


        Object it =23;
//        String s = (String) it;


//        int c = 10/0;


        String number ="23aa";
        Integer it1 =Integer.valueOf(number);
        System.out.println(it1+1);
        System.out.println("end");

    }
}
