package com.p113.d9_api_object;

public class Test2 {
    public static void main(String[] args) {
        Student s =new Student("ken",'m',19);
        Student s1 =new Student("ken",'m',19);
        System.out.println(s1.equals(s));

        System.out.println(s1.toString().equals(s.toString()));
    }
}
