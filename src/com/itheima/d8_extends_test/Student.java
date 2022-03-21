package com.itheima.d8_extends_test;

public class Student extends Role{
    private String  classname;

    public void wrieInfo(){
        System.out.println(getName()+"to day stduy");
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

//    public void setClassname(String classname) {
//        this.classname = classname;
//    }
}
