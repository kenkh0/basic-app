package com.itheima.loop;

import java.util.Scanner;

public class DeadForDemo8 {
    public static void main(String[] args) {
        for (int i = 0; i <3; i++) {
            
        }
        int okpassword=520;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Please input password");
            int password =sc.nextInt();
            if (password==okpassword){
                System.out.println("password is 520 test ok");
                break;
            }
            System.out.println("error password ");
        }

    }
}
