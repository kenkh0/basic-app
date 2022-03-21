package com.itheima.param;

public class case4 {
    public static void main(String[] args) {
        int [] number1= {1,2,3,4,5};
        int [] number2= new int[number1.length];

        copy(number1,number2);
        printArr(number1);
        printArr(number2);

    }

    public static void printArr(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1? arr[i] :arr[i]+","  );

        }
        System.out.println("]");

    }
    public static void copy(int [] number1 ,int []number2){
        for (int i = 0; i <number1.length; i++) {
            number2[i]=number1[i];

        }



    }
}
