package com.itheima.d10_extends_field_method;

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Student s=new Student();

        s.run();

    }
}

class people{
    public void run(){
        System.out.println("people run");
    }
}
class Student extends people{

    public void run(){
        System.out.println("student run");
    }
}
