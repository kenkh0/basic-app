package com.p113.d8_innerClass_anonymous;

public class Test2 {
    public static void main(String[] args) {
        Swimming s=new Swimming() {
            @Override
            public void swin() {

            }
        };
        go(s);


    }

    public static void go(Swimming s){
        System.out.println("start");
        s.swin();
        System.out.println("End");
    }
}

class Student implements Swimming{

    @Override
    public void swin() {
        System.out.println("student swim");
    }
}

interface Swimming{
    void swin();
}