package com.p113.d4_polymorphic_test;

public class Test {
    public static void main(String[] args) {

        Computer c=new Computer("lenovo");
        c.start();

       USB m =new Mouse("mouse");
        USB k =new KeyBoard("key Board");

            c.installUSB(k);
            c.installUSB(m);



    }
}
