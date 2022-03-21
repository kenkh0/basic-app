package com.itheima.d8_extends_test;

public class Role {
    private String name;
    private int age;

    public void queryCoure(){
        System.out.println(getName()+"check corure");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
