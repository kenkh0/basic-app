package com.itheima.d9_sxtends_feature;

public class ExtendsDemo {
    public static void main(String[] args) {
    Student s=new Student();


        Student.inAddr();


    }

}



class people{
    private int gge=21;
    private void run(){
        System.out.println("runfast");
    }

    public static int onLineNumber=161;
    public static void inAddr(){
        System.out.println("addr");
    }
}

class Student extends people{


    private void callpeople(){
        people p=new people();


    }
}
