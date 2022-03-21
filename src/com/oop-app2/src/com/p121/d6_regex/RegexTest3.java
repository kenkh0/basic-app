package com.p121.d6_regex;

import java.lang.reflect.Array;
import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        checkEmail();



    }
    public static void checkEmail(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please input email");

            String email =sc.next();

            if (email.matches("\\w{1,30}@\\w[a-zA-z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")){
                System.out.println(email+" is ok");
                break;
            }else {
                System.out.println(email +"not ok ");
            }
        }


    }
    public static void checkPhone (){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please input phone number");
            String phone =sc.next();

            if (phone.matches("1[3-9]\\d{9}")){
                System.out.println(phone+" is ok");

            }else {
                System.out.println(phone +"not ok ");
            }
        }
    }
}
