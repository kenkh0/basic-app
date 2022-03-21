package com.itheima.d3_final;

public class Test {

    public static final String schoolName="123";

    public static void main(String[] args) {
        final int age = 12;

        final double rat = 3.14;


    }
    public static void buy(final double z){

    }
}

class Animal{
    public  void run(){
        System.out.println("Animal");
    }
}

class Tiger extends Animal{
    @Override
    public void run() {
        System.out.println("Tiger");
    }
}