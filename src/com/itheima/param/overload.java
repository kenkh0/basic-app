package com.itheima.param;

public class overload {
    public static void main(String[] args) {

        fire();
        fire("123");
        fire("ficlk",12);
    }

    public static void fire(){
        System.out.println("delfut");
    }
    public static void fire(String location){
        System.out.println("delfut"+location);
    }
    public static void fire(String location,int number){
        System.out.println("delfut"+location+number);
    }
}
