package com.itheima.d13_interface_jdk8;

public interface SportManInter {


    default void run(){
        System.out.println("RUN");
    }

     public static void inAddr(){
         System.out.println("inAddr");
     }

}
class PingPongMan implements SportManInter{}

class Test{
    public static void main(String[] args) {
        PingPongMan p =new PingPongMan();
                p.run();

    }
}
