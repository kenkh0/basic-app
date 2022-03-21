package com.itheima.Random;

import java.util.Random;

public class RandomeDemo1 {
    public static void main(String[] args) {

//        Random r =new Random();
//        for (int i =0 ; i<20; i++) {
//            int data = r.nextInt(10)+1;
//
//            System.out.println(data);
//        }
//



        Random re =new Random();
        for (int i =0 ; i<20; i++) {
            int data = re.nextInt(9)+48;

            System.out.println(data);
        }

        //48-57 ==-48 (0-9)+48
        //65-90 ==-65 (0-25)25
    }
}
