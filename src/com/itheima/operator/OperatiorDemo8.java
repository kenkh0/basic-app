package com.itheima.operator;

public class OperatiorDemo8 {
    public static void main(String[] args) {
        double score =98;

        String rs = score >= 60 ? "pass" : "not pass";
        System.out.println(rs);

        int a= 10000;
        int b=2000;

        int rs2 = a>b ? a:b;
        System.out.println(rs2);

        System.out.println("---------------------------------");

        int j=10;
        int i=30;
        int k=50;

//        int temp = i>j ? i:j;
//        temp= temp>k ?temp:k;
//
//        System.out.println(temp);

        System.out.println("---------------------------------");

        int rsMax1 = j>i ? j>i? j:k : i>k?i:k;
        System.out.println(rsMax1);

    }
}
