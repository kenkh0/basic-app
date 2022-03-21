package com.itheima.d6_singleinstace;

public class SingleInstance2 {

    private static SingleInstance2 instance ;//null

    private SingleInstance2(){

    }


    public static  SingleInstance2 getInstance(){
        if(instance==null){
            instance=new SingleInstance2();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleInstance2 s1=SingleInstance2.getInstance();
        SingleInstance2 s2=SingleInstance2.getInstance();
        SingleInstance2 s3=SingleInstance2.getInstance();
        SingleInstance2 s4=SingleInstance2.getInstance();

        SinglInstance1 s6=SinglInstance1.instance;



        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s6);

    }
}
