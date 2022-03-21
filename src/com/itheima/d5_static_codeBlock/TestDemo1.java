package com.itheima.d5_static_codeBlock;

public class TestDemo1 {

    public static String schoolName;

    public static void main(String[] args) {


        System.out.println("=======MAIN ===");
        System.out.println(schoolName);
    }

    static {
        System.out.println("=====Static active========");
        schoolName="ken";

    }




    

}
