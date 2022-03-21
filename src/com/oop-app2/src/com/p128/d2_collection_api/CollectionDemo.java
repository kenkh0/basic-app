package com.p128.d2_collection_api;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection <String> list =new ArrayList<>();

        list.add ("Java");
        System.out.println(list.add("HTMl"));
        System.out.println(list.add("HTMl"));
        list.add ("MySQL");
        list.add ("Java");
        list.add ("heima");
        System.out.println(list);

        //list.clear();
        System.out.println(list);


        System.out.println(list.isEmpty());


        System.out.println(list.size());


        System.out.println(list.contains("Java"));


        list .remove("Java");
        System.out.println(list);

        Object [] arr =list.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("======================");
        Collection <String> c1 =new ArrayList<>();
        c1.add("c11");
        c1.add("c12");
       c1.add("c13");

        Collection <String> c2 =new ArrayList<>();
        c2.add("c21");
        c2.add("c22");
        c2.add("c23");

        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);

    }
}
