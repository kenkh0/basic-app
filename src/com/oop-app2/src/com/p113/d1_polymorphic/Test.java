package com.p113.d1_polymorphic;

public class Test {
    public static void main(String[] args) {
        Animal d=new Dog();
        go(d);


        Animal t=new Tortoise();
        go(t);
        Dog d1= (Dog) d;
        d1.door();


        int a=asd();
        System.out.println(a);

    }


    public static void go(Animal a ){
        System.out.println("start");
        a.run();
        System.out.println("end");


    }
    static int asd(){
        int d=1;
        return d;
    }
}
