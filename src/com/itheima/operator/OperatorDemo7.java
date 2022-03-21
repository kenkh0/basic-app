package com.itheima.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {

        double size = 9.8;
        double storage =6;
        // >6.95 & =8GB
        System.out.println(size >= 6.95 & storage >= 8);

        System.out.println(size >= 6.95 | storage >= 8);

        System.out.println(!true);
        System.out.println(!false);

        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println("--------------------------------");

        int a=10;
        int b=20;
        System.out.println(a >100 & ++b >10  );
        System.out.println(b );


        int i=10;
        int j=20;

        System.out.println(i>2 | ++j >10);
        System.out.println(j);



    }
}
