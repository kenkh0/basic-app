package com.itheima.String;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("please input Phone number ");
            String phoneNumber;

            phoneNumber = sc.next();
            if (phoneNumber.length()==11){
                String phoneNumber1=phoneNumber.replace(phoneNumber.substring(3,7),"****");
                System.out.println(phoneNumber1);
            }
        }
    }
}
