package com.p128.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {


        Collection<String> c =new ArrayList<>();

        c.add ("Java");
        System.out.println(c.add("HTMl"));
        System.out.println(c.add("HTMl"));
        c.add ("MySQL");
        c.add ("Java");
        c.add ("heima");
//        System.out.println(c);

        //c.clear();
        System.out.println(c);

        Iterator <String> it =c.iterator();
        String ele = it.next();
        while (it.hasNext()){
            ele=it.next();
            System.out.println(ele);


        }
//        System.out.println(ele);
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());



//
//        System.out.println(c.isEmpty());
//
//
//        System.out.println(c.size());
//
//
//        System.out.println(c.contains("Java"));
//
//
//        c .remove("Java");
//        System.out.println(c);
//
//        Object [] arr =c.toArray();
//        System.out.println(Arrays.toString(arr));
//        System.out.println("======================");
//        Collection <String> c1 =new ArrayList<>();
//        c1.add("c11");
//        c1.add("c12");
//        c1.add("c13");
//
//        Collection <String> c2 =new ArrayList<>();
//        c2.add("c21");
//        c2.add("c22");
//        c2.add("c23");
//
//        c1.addAll(c2);
//        System.out.println(c1);
//        System.out.println(c2);
    }
}
