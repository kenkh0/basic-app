package com.p134.d5_mao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> maps =new LinkedHashMap<>();//
       // Map<String,Integer> maps =new HashMap();//

        maps.put("apple",3);
        maps.put("banana",100);
        maps.put("Java book",100);
//        maps.put(null,null);

        System.out.println(maps);

        Set<String> test =maps.keySet();
        for (String key : test) {
            int t =maps.get(key);
            System.out.println(t+key);
        }

    }
}
