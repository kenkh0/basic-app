package com.itheima.d14_interface_attention;

public class Test {
    public static void main(String[] args) {
        Cat c =new Cat();
        c.eat();
        
    }

}
interface Food{
  default void eat(){
        System.out.println("food eat");
    }
}
class Animal{
    public void eat(){
        System.out.println("Animal eat");
    }
}

interface a{
    static void test(){
        System.out.println("a");
    }
}
interface b{
    static void test(){
        System.out.println("a");
    }
}
class Cat extends Animal implements Food{



        }