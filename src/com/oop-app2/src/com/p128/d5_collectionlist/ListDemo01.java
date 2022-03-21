package com.p128.d5_collectionlist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>();
       list.add("java");
       list.add("java");
       list.add("MySql");
       list.add("MySql");


       list.add(2,"Html");
        System.out.println(list);

        System.out.println(list.remove(2));
        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list.set(1, "ken"));
        System.out.println(list);


    }
}
