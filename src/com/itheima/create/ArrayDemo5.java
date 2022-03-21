package com.itheima.create;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        System.out.println(arr[0]);
        System.out.println(arr[9]);

        char[] chars = new char[100];

        System.out.println(chars[0]);
        System.out.println(chars[(int)99]);
        System.out.println(chars[0]);


        double[] scores =new double[90];
        System.out.println(scores[0]);
        System.out.println(scores[20]);


        boolean [] booleans = new boolean[100];
        System.out.println(booleans[2]);
        System.out.println(booleans[30]);


        String[]names = new  String[90];
        System.out.println(names[2]);
        System.out.println(names[89]);
    }
}
