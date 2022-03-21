package com.p134.d1_set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {

        Set<String> sets = new HashSet<>();
//        Set<String> sets = new LinkedHashSet<>();

        sets.add("MYSQL");
        sets.add("MYSQL");
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);





    }
}
