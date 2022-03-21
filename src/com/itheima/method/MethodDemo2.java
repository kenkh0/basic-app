package com.itheima.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        int rs = add(100,200);
        System.out.println(rs);

        System.out.println("--------------------");

        int rs1 =add(200,300);
        System.out.println(rs1);
    }

    public static int add (int a, int b){
        int c = a+b;
        return c;
    }
}
