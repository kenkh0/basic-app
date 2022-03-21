package com.p113.d4_polymorphic_test;

public class KeyBoard implements USB{
    private String name;
    @Override
    public void connect() {
        System.out.println("kb connect");
    }

    public KeyBoard(String name) {
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
        System.out.println("kb disconnect");
    }

    public void keyDown(){
        System.out.println(name+"KeyDonw");
    }
}
