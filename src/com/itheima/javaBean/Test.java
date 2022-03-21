package com.itheima.javaBean;

public class Test {
    public static void main(String[] args) {

        User u =new User();
        u.setHeight(150);
        u.setName("ken");
        u.setSalary(1000);
        System.out.println(u.getHeight());
        System.out.println(u.getName());
        System.out.println(u.getSalary());


        User u1=new User("ken",169.5,10000);
        System.out.println(u1.getHeight());
        System.out.println(u1.getName());
        System.out.println(u1.getSalary());

    }
}
