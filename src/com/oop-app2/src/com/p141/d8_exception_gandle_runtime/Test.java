package com.p141.d8_exception_gandle_runtime;

public class Test {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            chu(10,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }

    private static void chu(int a ,int b) {
        System.out.println(a);
        System.out.println(b);

        int c=a/b;
        System.out.println(c);

    }
}
