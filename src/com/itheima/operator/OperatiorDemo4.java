package com.itheima.operator;

public class OperatiorDemo4 {
    public static void main(String[] args) {
        int a=10;
        a++;// a= a+1
        System.out.println(a);

        ++a; // a=a+1
        System.out.println(a);

        int b=10;
        b--;//b=b-1

        --b;//b=b-1
        System.out.println(b);

        System.out.println("------------------------");

        int c=10;
        int rs = c++;
        System.out.println(rs);

        int z=10;
        int rs2=++z;
        System.out.println(z);

        System.out.println("------------------------");

        byte a1=5;
         int b1=555;

        a1*=b1;

        System.out.println(a1);
        System.out.println(b1);
//        System.out.println(rs3);

    }
}
