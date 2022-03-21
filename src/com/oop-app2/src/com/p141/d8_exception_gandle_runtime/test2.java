package com.p141.d8_exception_gandle_runtime;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.println("please input price");
                String PriceStr =sc.nextLine();
                double price =Double.valueOf(PriceStr);

                if(price>0){
                    System.out.println("price is : "+price);
                    break;
                }else {
                    System.out.println("price must height than 0");
                }
            } catch (Exception e) {
                System.out.println("please input ok");
            }


        }
    }
}
