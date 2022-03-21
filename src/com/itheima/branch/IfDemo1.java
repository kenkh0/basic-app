package com.itheima.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        // plus 60-100
        int heartBeat =30;
        if(heartBeat <60 || heartBeat>100){
            System.out.println("your hearBeat is "+heartBeat+" check your hearBeat");

        }
        System.out.println("flhgis");
        System.out.println("---------------------");

        double money = 5999;
        if(money >=1314 ){
            System.out.println("ok");

        }else{
            System.out.println("no money");

        }

        System.out.println("---------------------");
        int score =1;
        if (score>=90&&score<=100){
            System.out.println("A");
        }else if(score>=80 &&score<=89 ){
            System.out.println("B");
        }else if(score>=60 &&score<=79 ) {
            System.out.println("C");
        } else if(score>=0 &&score<=60 ) {
            System.out.println("D");
        }else {
            System.out.println("please input 0-100");
        }

    }

}
