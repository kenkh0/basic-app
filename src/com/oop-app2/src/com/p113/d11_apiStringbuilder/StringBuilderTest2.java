package com.p113.d11_apiStringbuilder;

import java.lang.reflect.Array;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        int  []arr = {11,22,33,44,55};

        System.out.println(output(arr));

    }
    public static String output(int [] arr ){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <arr.length; i++) {
            if (i==0){
                sb.append("[").append(arr[i]).append(",");
            }else if(i==arr.length-1) {
                sb.append(arr[i]).append("]");
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        String rs =sb.toString();
        return rs;

    }
}
