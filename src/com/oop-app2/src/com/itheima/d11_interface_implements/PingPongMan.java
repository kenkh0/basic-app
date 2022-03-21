package com.itheima.d11_interface_implements;

public class PingPongMan implements SportMan,Law{
    private  String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void rule() {
        System.out.println(name+" rule");
    }

    @Override
    public void run() {
        System.out.println(name+" run");

    }

    @Override
    public void competition() {
        System.out.println(name+"  competition");

    }
}
