package com.p121.d8_sort_bbinartysearach;

public class Test2 {
    public static void main(String[] args) {
        int []arr = {10,14,16,25,28,30,35,88,100};

        System.out.println(binarySearch(arr, 10));

    }

    public static int binarySearch (int [] arr , int data){
        int left =0;
        int right =arr.length-1;

            while (left<=right){
                int middleIndex = (left+right)/2;

                if(data>arr[middleIndex]){
                    left =middleIndex+1;
                }else if(data<arr[middleIndex]){
                    right=middleIndex-1;

                }else {
                    return middleIndex;
                }


            }
            return -1;


    }
}
