package com.itheima.d4_static_attention;

public class Test {
    public static int onLineNumber;
    private String name;
    public static void getMax(){
        System.out.println(onLineNumber);
        System.out.println(Test.onLineNumber);
        inAddr();
//        System.out.println(name);
    }

    public void ren(){
        System.out.println(onLineNumber);
        System.out.println(Test.onLineNumber);
        System.out.println(name);
    }
    public static void inAddr(){
        System.out.println("s");
        getMax();
    }

    public void sing(){


    }
    public static void main(String[] args) {
        Test.inAddr();
    }
}
