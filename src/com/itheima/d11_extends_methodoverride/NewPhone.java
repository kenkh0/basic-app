package com.itheima.d11_extends_methodoverride;

public class NewPhone extends phone{

    @Override
    public void call(){
        super.call();
        System.out.println("vedio call");
    }


    public void sendMessage(){
    super.sendSMS();
        System.out.println("send  MMS");
    }
    public static void test(){
        System.out.println("send  test");

    }
}
