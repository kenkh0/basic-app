package com.itheima.d5_static_codeBlock;

public class TestDemo2 {
    private  String name;

    {
        System.out.println("======consrurin====");
        name="ken";
    }

    public  TestDemo2(){
        System.out.println("TestDemo2");
    }
    public static void main(String[] args) {
        new  TestDemo2();
        new  TestDemo2();

    }





    

}
