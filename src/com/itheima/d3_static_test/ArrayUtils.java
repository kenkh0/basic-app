package com.itheima.d3_static_test;

public class ArrayUtils {

    private ArrayUtils(){

    }


    public static String toString  (int [] arr){
        if(arr!=null){
            String result="[";

            for (int i = 0; i <arr.length; i++) {
                result+=(i==arr.length-1? arr[i]:arr[i]+",");
            }
            result+="]";
            return result;
        }return null;

    }
    
    public static double getAverage(int [] arr){
        if (arr!=null) {
            int max =arr[0];
            int min =arr[0];
            int sum =0;

            for (int i = 0; i <arr.length; i++) {
                if (max<arr[i]){
                    max=arr[i];

                }

                if (min>arr[i]){
                    min=arr[i];
                }

                sum+=arr[i];
            }
            return (sum-max-min)*1.0/(arr.length-2);
        }else if(arr.length==0){
            return -1;
        }return -2;
    }


}
