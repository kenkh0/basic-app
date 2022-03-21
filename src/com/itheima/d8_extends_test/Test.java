package com.itheima.d8_extends_test;



public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("ken");
        s1.setAge(11);
        s1.setClassname("sd");

        System.out.println(s1.getName());
        System.out.println(s1.getClassname());
        System.out.println(s1.getAge());
        s1.queryCoure();
        s1.wrieInfo();

    }
}
