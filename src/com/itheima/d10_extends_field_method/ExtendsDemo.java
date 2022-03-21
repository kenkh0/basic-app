package com.itheima.d10_extends_field_method;

public class ExtendsDemo {
    public static void main(String[] args) {
        Wolf w=new Wolf();

        System.out.println(w.name);
        w.showName();

    }
}

class Animal{
    public String name ="father";
}
class Wolf extends Animal{
    public String name="Wolf";

    public void showName(){
        String name="showname";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

    }
}
