package com.p141.d2_stream;

public class test {
//    public static double allMoney;

    public static void main(String[] args) {
        double allMoney=0;

        int [] arr ={1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arr.length; i++) {
            allMoney+=arr[i];
        }
        System.out.println(allMoney);

        int [] arr1 ={1,2};

        for (int i = 0; i < arr1.length; i++) {
            allMoney+=arr[i];
        }
        System.out.println(allMoney);


    }
}
