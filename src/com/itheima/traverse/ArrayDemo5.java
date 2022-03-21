package com.itheima.traverse;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int [] arr ={5,2,3,1,99,999,55,55,66,44,66};
        //           0 1 2 3

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {

                if(arr[j] >arr[j+1]){
                    int temp = arr[j+1]; //temp =1
                    arr[j+1]=arr[j];
                    arr[j] =temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
