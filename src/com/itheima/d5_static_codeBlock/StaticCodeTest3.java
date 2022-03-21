package com.itheima.d5_static_codeBlock;

import java.util.ArrayList;

public class StaticCodeTest3 {

       public static ArrayList<String> cards=new ArrayList<>();

        static {
            String [] colors= {"X","Y","Z","W"};

            String [] sizes ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};


            for (int i = 0; i < sizes.length; i++) {
                for (int j = 0; j <colors.length; j++) {
                    cards.add(sizes[i]+colors[j]);
                }
            }

            cards.add("KING");
            cards.add("king");
        }

    public static void main(String[] args) {


        System.out.println("new card "+cards);
    }
}
