package com.p134.d3_CollectionsDemo01;


import com.p134.d1_set.Apple;

import java.util.*;

public class CollectionsDemo02 {
    public static void main(String[] args) {

        List<Apple> apples =new ArrayList<>();
        apples.add(new Apple("a","red",9.9,500));
        apples.add(new Apple("b","green",15.9,300));
        apples.add(new Apple("c","puple",29.9,400));
        apples.add(new Apple("d","yellow",9.8,500));

        Collections.sort(apples);

        System.out.println(apples);
//
//        Collections.sort(apples, new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return Double.compare(o1.getPrice(),o2.getPrice());
//            }
//        });


        Collections.sort(apples, ( o1,  o2) -> Double.compare(o1.getPrice(),o2.getPrice()));
        System.out.println(apples);
    }
}
