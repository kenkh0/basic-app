package com.p134.d5_mao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo2 {
    public static void main(String[] args) {
//        Map<String,Integer> maps =new LinkedHashMap<>();///
        Map<String,Integer> maps =new HashMap();//

        maps.put("apple",3);
        maps.put("banana",100);
        maps.put("Java book",100);
//        maps.put(null,null);

        System.out.println(maps);
//
//        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
//        for (Map.Entry<String, Integer> entry : entries) {
//            System.out.println(entry);
//        }

        maps.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key+"===="+value);
            }
        });
    }
}
