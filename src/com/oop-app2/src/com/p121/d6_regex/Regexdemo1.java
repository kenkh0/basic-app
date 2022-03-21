package com.p121.d6_regex;

public class Regexdemo1 {
    public static void main(String[] args) {

        System.out.println(checkQQ("251425998"));
        System.out.println(checkQQ("25142a998"));
        System.out.println(checkQQ("null"));
        System.out.println(checkQQ("2344"));
        System.out.println("-----------");
        System.out.println(checkQQ2("1234567"));
        System.out.println(checkQQ2("25142a998"));
        System.out.println(checkQQ2("null"));
        System.out.println(checkQQ2("2344"));





    }

    public static boolean checkQQ2 (String qq){
        return qq!=null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq){
        if (qq==null || qq.length()<6 || qq.length()>20){
            return false;
        }

        //251425a87
        for (int i = 0; i < qq.length(); i++) {
                char ch =qq.charAt(i);
                if (ch<'0'  || ch>'9'){
                    return false;
                }
        }
        return true;

    }
}
