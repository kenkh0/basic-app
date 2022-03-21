package com.itheima.d3_final;

import java.lang.reflect.Array;

public class Test2 {
    public static void main(String[] args) {
        final int[] w={1,2,3,4,5};
        for (int i = 0; i < w.length; i++) {
            w[i]=i;
            System.out.println(w[i]);
        }

    }
}
