package com.itheima.String;

import java.util.Random;

public class StringDemo8 {
    public static void main(String[] args) {
        String datas="abcdefghijklmnoopqrstuvmxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r =new Random();
        String codes="";
        for (int i= 0; i <5; i++) {
            int index =r.nextInt(datas.length());

            char c =datas.charAt(index);
            codes+=c;
        }

        System.out.println(codes);
    }
}
