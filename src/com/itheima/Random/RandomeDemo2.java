package com.itheima.Random;

import java.util.Random;
import java.util.Scanner;

public class RandomeDemo2 {
    public static <number> void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int number = r.nextInt(100)+1;
        while (true){
            System.out.println("please guss the Random number beteen 0-100");
           int guss = sc.nextInt();
           if(guss== number){
               System.out.println("correct the Random number is "+number);
               break;
           }else if (guss <number){
               System.out.println("the number is too smail");

           }else   {
                System.out.println("the number is to big");
            }



        }
    }
}
