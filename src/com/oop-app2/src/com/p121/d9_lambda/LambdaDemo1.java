package com.p121.d9_lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {

        Animal a =new Animal() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };
        a.run();



    }
}
