package com.itheima.method;

public class MethodDemo3 {
    public static void main(String[] args) {
        print("s");
        System.out.println("-----------------");
        print("p");
    }
    public static void print(String s){
        for (int i=0 ;i<3;i++) {
            System.out.println("Hello world"+s);
        }

    }
}
