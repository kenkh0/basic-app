package com.itheima.String;

import java.util.Scanner;

public class StringEqualsDemo4 {
    public static void main(String[] args) {
        String okName = "itheima";
        String okPassword ="123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("please input name ");
        String name =sc.next();
        System.out.println("please input password ");
        String password =sc.next();

        if (okName.equals(name) &&okPassword.equals(password)){
            System.out.println("ok");
        }else {
            System.out.println("error");
        }

        String code="23AdFh";
        String code1="23aDfH";
        System.out.println(code.equals(code1));
        System.out.println(code.equalsIgnoreCase(code1));
    }
}
