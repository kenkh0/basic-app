package com.itheima.String;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        String okName="admin";
        String okPassword="a1234";
        int checkPassword=0;
        Scanner c =new Scanner(System.in);
        for (int i = 0; i <3; i++) {
            System.out.println("please input name");
            String name = c.next();
            System.out.println("please input password");
            String passowrd = c.next();

            if(okName.equals(name)&&okPassword.equals(passowrd)){
                System.out.println("login ok");
                break;
            }else {

                ++checkPassword;
                if (checkPassword==3){
                    System.out.println("you have input incorrection name or password 3time ");
                    break;
                }else { System.out.println("error");}
            }
        }




    }
}
