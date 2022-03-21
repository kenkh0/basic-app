package com.p121.d9_lambda;

public class Demo2 {
    public static void main(String[] args) {
//        Swimming s1 =new Swimming() {
//            @Override
//            public void swin() {
//                System.out.println("techer swing");
//            }
//        };

            Swimming s1 =()->{
                System.out.println("techer wing");
            };
        go(s1);
        System.out.println("-------------");

        go(()->{
            System.out.println("gogogo");
        } );

    }


    public static void go(Swimming s){
        System.out.println("start");
        s.swin();
        System.out.println("End");
    }
}



@FunctionalInterface
interface  Swimming{
    void swin();
}