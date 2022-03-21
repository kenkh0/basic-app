package com.p134.d5_mao;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {
//        Map<String,Integer> maps =new LinkedHashMap<>();///

        String[] selects ={"A","B","C","D"};
        StringBuilder sb =new StringBuilder();
        Random r=new Random();
        for (int i = 0; i <80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(sb);
        Map<Character ,Integer> infors = new HashMap<>();
//
        for (int i = 0; i <sb.length(); i++) {
//            infors.put(sb.charAt(i),i);

            char ch =sb.charAt(i);
            if (infors.containsKey(ch)){
                infors.put(ch,infors.get(ch)+1);
            }else {
                infors.put(ch,1);
            }

        }

        System.out.println(infors);
    }
}
