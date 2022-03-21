package com.itheima.d14_this;

public class Test {
    public static void main(String[] args) {
         Student s1 =new Student("ken","apple");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());


        Student s2 =new Student("mary");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());

    }
}
