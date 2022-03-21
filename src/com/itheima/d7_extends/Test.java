package com.itheima.d7_extends;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        Teacher t1= new Teacher();


        s1.setName("stedents1");
        t1.setName("teacht1");

        System.out.println(s1.getName());
        System.out.println(t1.getName());
        s1.study();
        t1.tech();

    }
}
