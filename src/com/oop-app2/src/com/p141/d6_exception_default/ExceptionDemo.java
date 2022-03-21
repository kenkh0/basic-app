package com.p141.d6_exception_default;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start");
        chu(10,0);
        System.out.println("End");
    }

    private static void chu(int a ,int b) {
        System.out.println(a);
        System.out.println(b);

        int c=a/b;
        System.out.println(c);

    }
}
