package com.p134.d2_params;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {

        sum();
        sum(10);
        sum(10,20);
        sum(new int [] {10,20,30,40,50});
    }

    public static void sum (int...nums){
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
