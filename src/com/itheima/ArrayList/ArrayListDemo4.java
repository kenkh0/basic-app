package com.itheima.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> scoresList= new ArrayList<>();

        scoresList.add(98);
        scoresList.add(77);
        scoresList.add(66);
        scoresList.add(89);
        scoresList.add(79);
        scoresList.add(50);
        scoresList.add(100);

//        System.out.println(scoresList.size());
//        for (int i = 0; i < scoresList.size(); i++) {
//            if(scoresList.get(i)<80){
//                System.out.println("for loop"+i+"="+scoresList.size());
//
//                scoresList.remove(i);
//                i--;
//            }
//        }
//        System.out.println(scoresList);


        for (int i = scoresList.size()-1; i>0; i--) {
            if(scoresList.get(i)<80){
                System.out.println("for loop"+i+"="+scoresList.size());

                scoresList.remove(i);
            }
        }
        System.out.println(scoresList);
        }




}
