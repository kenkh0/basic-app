package com.itheima.oopMemory;

public class Test {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.hobby="pley game";
        s1.name="Ken";
        s1.sex='M';
        s1.study();
        System.out.println(s1);
        Student s2=s1;

        System.out.println(s2);

        s2.hobby="fuck";
        System.out.println(s2.name);
        System.out.println(s1.hobby);
        System.out.println(s2.sex);
        s2.study();
        s1.study();





    }
}
