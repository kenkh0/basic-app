package com.itheima.d3_static_test;

import java.util.Random;

public class VerifyTool {

    private VerifyTool(){

    }
    public static String createCode(int n){
        String chars="abcdefghijklmnopqrstuxwxyzABCDEFGHIJKLMNOPQRSTUVMXYZ0123456789";

        String code="";

        Random r =new Random();

        System.out.println();
        for (int i = 0; i <n; i++) {
            int index =r.nextInt(chars.length());
            code+=chars.charAt(index);
        }

        return code;
    }

}
