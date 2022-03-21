package com.itheima.String;

public class StringDemo1 {
    public static void main(String[] args) {
        String name="i kove you";
        System.out.println(name);


        String s1=new String();
        System.out.println(s1);


        String s2= new String("hi s1");
        System.out.println(s2);


        char [] chars = {'a','b','c','d'};
        String s3 = new String(chars);
        System.out.println(s3);

        byte [] bytes={97,98,99,65,66,67};
        String s4= new String(bytes);
        System.out.println(s4);

        byte b1= 101;
        String s5= new String(String.valueOf(b1));
        System.out.println(s5);

        System.out.println("----------------");
        String ss1 ="abc";
        String ss2 ="abc";
        System.out.println(ss1==ss2);
        char [] chars1 ={'a','b','c'};
        char [] chars2 ={'a','b','c'};
        String ss3 =new String(chars1);
        String ss4 =new String(chars1);
        System.out.println(ss3==ss4);
        System.out.println(chars1==chars2);
    }

}
