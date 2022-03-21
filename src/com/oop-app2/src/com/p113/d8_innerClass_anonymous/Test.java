package com.p113.d8_innerClass_anonymous;

public class Test {
    public static void main(String[] args) {
        Animal a= new Animal() {
            @Override
            public void run() {
                System.out.println("t" );
            }
        };
        a.run();

        Animal t=new Tiger();
        t.run();



    }
}

class Tiger  extends Animal{

    @Override
    public void run() {
        System.out.println("Tiger Run");
    }
}

abstract class Animal{
    public abstract void run();
}