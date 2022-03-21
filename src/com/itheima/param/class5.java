package com.itheima.param;

import java.util.Scanner;

public class class5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] scores = new int[6];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Please input "+(i+1)+"seores");
            scores[i]=sc.nextInt();
        }

        System.out.println(sum4(scores));
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

    }
    public static int[] max(int[]arr){
        for (int i = 1; i <= arr.length-1; i++) {
            for (int j = 0; j <arr.length-i; j++) {
               if(arr[j]>arr[j+1]){
                   int temp = arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
               }
            }

        }

        arr[arr.length-1]=0;
        arr[0]=0;


        return arr;
    }


    public static double sum4(int[]arr){
        //0 ,2 ,3 ,4 ,5 0
        max(arr);
        double rs=0;
        for (int i = 0; i <arr.length-1; i++) {
            rs+=arr[i];
        }


        return rs/(arr.length-2);
    }

}
