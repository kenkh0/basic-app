package com.p134.d1_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {
        Set<Integer> sets =new TreeSet<>();
        sets.add(23);
        sets.add(24);
        sets.add(12);
        sets.add(8);
        System.out.println(sets);

        Set<String> sets1 =new TreeSet<>();
        sets1.add("Java");
        sets1.add("Java");
        sets1.add("angela");
        sets1.add("Java");
        sets1.add("About");
        sets1.add("Python");
        sets1.add("UI");
        sets1.add("UI");

        System.out.println(sets1);
        System.out.println("=====================");

        Set<Apple> apples =new TreeSet<>(( o1, o2)-> Double.compare(o2.getPrice(),o1.getPrice()));

           

        apples.add(new Apple("a","red",9.9,500));
        apples.add(new Apple("b","green",15.9,300));
        apples.add(new Apple("c","puple",29.9,400));
        apples.add(new Apple("d","yellow",9.8,500));

        System.out.println(apples);



    }
}
