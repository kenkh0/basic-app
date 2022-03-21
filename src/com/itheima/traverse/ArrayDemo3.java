package com.itheima.traverse;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int [] number = new int [5];

        int hit=0;
        for (int i = 0; i < number.length; i++) {
            number[i] =r.nextInt(19)+1;
            System.out.println(number[i]);
        }

        while (true){
            System.out.println("Please input between 1-20 number to geuss 5 numer ");
            int guss = sc.nextInt();
            for (int i = 0; i < number.length; i++) {
                if (guss == number[i]) {
                    System.out.println("you guss ok you have " + hit + "correct. The number in " + number[i]);
                    ++hit;
                    continue;
                }
            }
            if (hit == 5) {
                for (int j = 0; j < number.length; j++) {
                    System.out.print("the 5 number is " + number[j] + ",");
                }
                break;
            }
            System.out.println("try again");

        }





    }
}
