package com.itheima.param;

import java.util.Random;

public class case3 {
    public static void main(String[] args) {
        System.out.println(redomNuber(100));

    }

    public static String redomNuber(int a){
        String ab ="";
        int rsChar[] =new int[a];
        Random r =new Random();
        for (int i = 0; i <a; i++) {//5
            int number = r.nextInt(3)+1;

            switch (number){
                case 1:
                    //number
                    rsChar [i]=r.nextInt(9)+48;
                    System.out.println("case 1  "+rsChar[i]);

                    break;
                case 2:
                    //A
                    rsChar [i]=r.nextInt(26)+65;
                    System.out.println("case 2  "+rsChar[i]);

                    break;
                case 3:
                    //b
                    rsChar [i]=r.nextInt(25)+97;
                    System.out.println("case 3  "+rsChar[i]);
                    break;


            }

            }
        for (int i1 = 0; i1 < rsChar.length; i1++) {

            System.out.println(rsChar[i1]);

        }
        for (int i = 0; i <rsChar.length; i++) {
            ab+=(Character.toString((char)rsChar[i]));
        }
        return ab;
    }




}
