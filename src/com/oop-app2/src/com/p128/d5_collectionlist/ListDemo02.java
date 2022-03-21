package com.p128.d5_collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>();
       list.add("java");
       list.add("java");
       list.add("MySql");
       list.add("MySql");


//       list.add(2,"Html");
//        System.out.println(list);
//
//        System.out.println(list.remove(2));
//        System.out.println(list);
//
//        System.out.println(list.get(2));
//
//        System.out.println(list.set(1, "ken"));
//        System.out.println(list);
        System.out.println("==============================");
        for (int i = 0; i < list.size(); i++) {
            String ele =list.get(i);
            System.out.println(ele);
        }

        System.out.println("==============================");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
//        System.out.println("==============================");
//         for (String:ele :list) {System.out.println(ele);}

             System.out.println("==============================");
            list.forEach(s->{
                System.out.println(s);
            });

    }
}
