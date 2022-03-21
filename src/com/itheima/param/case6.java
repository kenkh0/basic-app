package com.itheima.param;

public class case6 {
    public static void main(String[] args) {
        int [] number4= {1,9,8,3};
        for (int i = 0; i < number4.length; i++) {
            number4[i]=((number4[i]+5)%10);
        }

        for (int i = 1; i <= number4.length-1; i++) {
            for (int j = 0; j < number4.length-i; j++) {
                int temp =number4[j+1];
                number4[j+1]=number4[j];
                number4[j]=temp;
            }
        }


        for (int i = 0; i < number4.length; i++) {
            System.out.println(number4[i]);
        }
    }


}
