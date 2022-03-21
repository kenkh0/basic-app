package com.p121.d7_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int [] arr ={10,2,55,23,24,100};
        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //3
        int index = Arrays.binarySearch(arr,55);
        System.out.println(index);

        int index2 = Arrays.binarySearch(arr,552);
        System.out.println(index2);


        int [] arr2 ={12,36,34,25,234,11,356,100};
        System.out.println(Arrays.binarySearch(arr2, 36));

    }
}
