package com.itheima.d1_static_method;

public class Student {
    private String name;
    private int age;


    public void study(){
        System.out.println(name+"good study");
    }

    public static void getMax(int a,int b){
        System.out.println(a>b ?a:b);
    }

    public static void main(String[] args) {
            Student.getMax(10,100);

            getMax(200,20);

            Student s1 =new Student();
            s1.name="ken";
            s1.study();


            s1.getMax(100,20);
    }
}
