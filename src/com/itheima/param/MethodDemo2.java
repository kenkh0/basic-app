package com.itheima.param;

import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args) {
        int [] abc = {11,22,33,44,55};
        int [] arrs = {11,22};
        int [] number2 = {1,2,3,4};
        int [] number3 = {11,22,33,44,55};

        change(arrs);
        System.out.println(arrs[1]);
        print1(abc);
        System.out.println("-----------------------------");
        print1(number2);

        System.out.println("-----------------------------");
        System.out.println(checkNumber(number3,arrs));
    }
    public static void change(int [] arrs){
        System.out.println(arrs[1]);
        arrs[1]=22;
        System.out.println(arrs[1]);
    }

    public  static void print1(int [] number1){
        if(number1.length>0 && number1!=null)
     for (int i = 0; i <number1.length; i++) {
        System.out.print(i== number1.length ? number1[i]: number1[i]+" ,");

//            if(i==number1.length-1) {
//                System.out.println(number1[i]);
//            }else System.out.print(number1[i]+" ,");
       }
        System.out.println("");
    }

    public static int retuenIndex(int [] random ){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please input number ");
        int c= sc.nextInt();

        int index=0;
        for (int i = 0; i <random.length; i++) {
            if (random[i]==c){
                index= i;
                break;
            }else {
                index=-1;
            }

        }
        return index;

    }
    public static boolean checkNumber(int[] a,int[]b){
        if(a.length!=b.length){
            return false;
        }
        for (int i = 0; i <a.length; i++) {
            if(a[i]!=b[i]){
                return false;
            }

        }
        return true;


    }
}
