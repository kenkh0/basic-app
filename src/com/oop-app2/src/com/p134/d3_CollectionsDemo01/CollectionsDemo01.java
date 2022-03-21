package com.p134.d3_CollectionsDemo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<String > names =new ArrayList<>();
//        names.add("a");
//        names.add("b");
//        names.add("c");
//        names.add("d");
        Collections.addAll(names,"a","b","c","d");
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);
        System.out.println("======================");

        List <Integer> list =new ArrayList<>();
        Collections.addAll(list, 12,23,2,4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);



    }
}
