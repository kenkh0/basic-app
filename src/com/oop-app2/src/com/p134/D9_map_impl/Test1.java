package com.p134.D9_map_impl;

import com.p121.d5_integer.Test;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        Map<String, List<String>> data = new HashMap<>();


        List<String> selects = new ArrayList<>();
        Collections.addAll(selects, "A", "A");
        data.put("apple", selects);

        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1, "A", "A", "D");
        data.put("banana", selects1);


        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2, "A", "B", "C", "D");
        data.put("CAt", selects2);

        System.out.println(data);
        System.out.println(data.values());

        Collection<List<String>> test1 = data.values();
        Map<String, Integer> output = new HashMap<>();

        for (List<String> strings : test1) {
            for (String string : strings) {
                if (output.containsKey(string)) {
                    output.put(string, output.get(string) + 1);
                } else {
                    output.put(string, 1);
                }
            }

        }
        System.out.println(output);
    }
}
