package com.p128.d1.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {

        Collection list = new ArrayList();
        list.add ("java");
        list.add ("java");
        list.add ("mybatis");
        list.add (23);
        list.add (23);
        list.add (false);
        list.add (false);
        System.out.println(list);

        //
        Collection list1 = new HashSet();
        list1.add ("java");
        list1.add ("java");
        list1.add ("mybatis");
        list1.add (23);
        list1.add (23);
        list1.add (false);
        list1.add (false);

        System.out.println(list1);

        System.out.println("=============================");
        Collection <String>list2 = new ArrayList<>();
        list2.add("java");
        //list2.add(23;
        list2.add("java");
        System.out.println("=============================");
        Collection <Integer>list3 = new ArrayList<>();
        list3.add(23);
        list3.add(3);
        list3.add(44);


        Collection <Double>list4 = new ArrayList<>();
        list4.add(23.0);
        list4.add(3.0);
        list4.add(44.0);
        System.out.println(list4);


    }
}
