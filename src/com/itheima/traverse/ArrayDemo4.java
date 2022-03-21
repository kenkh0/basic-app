package com.itheima.traverse;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int [] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <codes.length; i++) {
            System.out.println("the number is "+(i+1)+"codes");
            int code =sc.nextInt();

            codes [i]= code;

        }
        Random r =new Random();

        for (int i = 0; i < codes.length; i++) {
             int index = r.nextInt(codes.length);//22 33 35 13 88   index is 3 (13)
             int temp = codes[index];//3  temp =13
             codes[index] =codes[i];
             codes[i] = temp;
        }
        System.out.print("yor redome result is ");

        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i]+"\t");
        }

    }
}
