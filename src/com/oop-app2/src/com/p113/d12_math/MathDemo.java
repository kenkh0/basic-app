package com.p113.d12_math;

public class MathDemo {
    public static void main(String[] args) {

        long starTime = System.currentTimeMillis();
        String rs="";
        for (int i = 0; i <1000000; i++) {
            int b =i;
            rs+="1";
//            System.out.println(rs);
        }

        long endTime =System.currentTimeMillis();
        System.out.println((endTime-starTime)/1000.0+"s");
    }
}
