package com.itheima.traverse;

public class ArrayDemo {
    public static void main(String[] args) {
//        int [] arr ={16,26,36,6,100};
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            sum+=arr[i];
//        }
//        System.out.println(sum);;
//        System.out.println("------------------------");;

        int [] arr1 ={15,9000,10000,20000,9500,-5};
        int max=arr1[0];
        for (int i = 0 ; i < arr1.length; i++) {
            if (max< arr1[i] ){
                max=arr1[i];
            }


        }
        System.out.println(max);;
    }
}
