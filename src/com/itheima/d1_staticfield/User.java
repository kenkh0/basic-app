package com.itheima.d1_staticfield;

public class User {
    public static int onlineNumber=161;

    private String name;
    private int age;


    public static void main(String[] args) {
        //1
        User.onlineNumber++;
        System.out.println(onlineNumber);

        //2
        User u1 =new User();
        u1.name ="ken";
        u1.age=36;
        System.out.println(u1.age+u1.name);

        //
        u1.onlineNumber++;


        User u2 =new User();
        u2.name ="apple";
        u2.age=77;
        System.out.println(u2.age+u2.name);

        //
        u1.onlineNumber++;
        System.out.println(onlineNumber);





    }
}
