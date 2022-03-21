package com.itheima.D13_extends_construcior2;

public class Student extends people{
    private String className;
    public Student(String name,int age,String className){
        super("name",age);
        this.className=className;

    }
    public Student(){

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
