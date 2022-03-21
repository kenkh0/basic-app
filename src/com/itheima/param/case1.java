package com.itheima.param;

import com.itheima.branch.SwitchDemo3;

import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please inout the ticket price ");
        double price = sc.nextInt();
        double z=price*0.9;
        System.out.println(z);
        System.out.println("Please inout the month");
        int month = sc.nextInt();
        System.out.println("Please input 1  is Frist call 2 is second class");
        String lv = sc.next();

        System.out.println("the discount is "+priceCal(price, month, lv));
    }

    public static double priceCal(double price,int month,String lv){
        String monthCal;
        double rs=0;
        if(month >=5 & month<=10){
            monthCal="Big Month";
            switch(lv){
                case "1":
                    price*=0.9;
                    break;
                case "2":
                    price*=0.8;
                    break;
                default:
                    System.out.println("input month not correct");
                    price=-1;
            }
        }else if (month ==11 ||month==12 ||month>1&&month<4 ) {
            switch (lv) {
                case "1":
                    price *= 0.7;
                    break;
                case "2":
                    price *= 0.65;
                    break;
                default:
                    System.out.println("input month not correct");
                    price = -1;
            }

        }else {System.out.println("Please in put correct class");
        price=-1;}


        return price;
    }

}
