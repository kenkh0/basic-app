package com.p128.d9_genericity_method;

public class GenericDemo {
    public static void main(String[] args) {
        String []name ={"apple ","banana","cat"};

        Integer [] ages ={10,20,30};


        printArray(name);
        printArray(ages);
        printArray1(name);
        printArray1(ages);

    }

    public static <T> void  printArray(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static <T> void  printArray1(T[] arr){
        if(arr!=null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            System.out.println(sb);

        }else {
            System.out.println(arr);
        }



        }

}
