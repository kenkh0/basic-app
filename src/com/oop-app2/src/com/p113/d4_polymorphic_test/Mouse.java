package com.p113.d4_polymorphic_test;

public class Mouse implements USB{
    private String name;
    @Override
    public void connect() {
        System.out.println(name+" connect");
    }

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void disconnect() {
        System.out.println(name+" disconnect");
    }

    public void dbClick(){
        System.out.println(name+"dbClick");
    }
}
