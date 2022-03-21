package com.itheima.oop;

public class Car {
    String name;
    double price;
    private int age;
//
//    public Car(String name){
//       this.name=name;
//        System.out.println("HI"+name);
//    }

    public void setAge(int age){
        if(age>=0 && age<=200){
            this.age=age;
        }else {
            System.out.println("not correct age");
        }

    }
    public int getage(){
        return age;
    }
//    public void start(int a){
//        System.out.println(name +" price is "+price+" and start"+a);
//    }
//
//    public void run(){
//        System.out.println(name +" price is "+price+" and run");
//    }



}
