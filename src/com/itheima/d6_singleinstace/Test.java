package com.itheima.d6_singleinstace;

public class Test {
    public static void main(String[] args) {
        SinglInstance1 s1=SinglInstance1.instance;
        SinglInstance1 s2=SinglInstance1.instance;
        SinglInstance1 s3=SinglInstance1.instance;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
