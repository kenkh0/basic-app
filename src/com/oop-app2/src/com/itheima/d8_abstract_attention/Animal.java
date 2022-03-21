package com.itheima.d8_abstract_attention;

public abstract class Animal {
    public abstract void run ();
    private String name;
    public Animal(){

    }
    public void go(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
