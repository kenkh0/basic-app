package com.p113.d1_polymorphic;

public class Dog extends Animal{

    @Override
    public void run() {
        System.out.println("Dog Run");
    }

    public void door(){
        System.out.println("dor door");
    }
}
