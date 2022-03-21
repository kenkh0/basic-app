package com.p134.D9_map_impl;

import java.util.*;
import java.util.function.BiConsumer;

public class MapTest4 {
    public static void main(String[] args) {
//        Map<String,Integer> maps =new LinkedHashMap<>();///


//        String[] selects ={"A","B","C","D"};
//        StringBuilder sb =new StringBuilder();
//        Random r=new Random();
//        for (int i = 0; i <80; i++) {
//            sb.append(selects[r.nextInt(selects.length)]);
//        }
//        System.out.println(sb);
//        Map<Character ,Integer> infors = new HashMap<>();
////
//        for (int i = 0; i <sb.length(); i++) {
////            infors.put(sb.charAt(i),i);
//
//            char ch =sb.charAt(i);
//            if (infors.containsKey(ch)){
//                infors.put(ch,infors.get(ch)+1);
//            }else {
//                infors.put(ch,1);
//            }
//
//        }
//
//        System.out.println(infors);

        Map <String , List<String>> data =new HashMap<>();

        List<String > selects =new ArrayList<>();
        Collections.addAll(selects,"A","C");
        data.put("apple",selects);


        List<String > selects1 =new ArrayList<>();
        Collections.addAll(selects1,"B","C","D");
        data.put("Banana",selects1);

        List<String > selects2 =new ArrayList<>();
        Collections.addAll(selects2,"A","B","C","D");
        data.put("cat",selects2);


        System.out.println(data);

        Map<String ,Integer> infos =new HashMap<>();

        Collection<List<String>> values = data.values();
        System.out.println(values);


//        for (List<String> value : values) {
//            for (String s : value) {
//                if(infos.containsKey(s)) {
//                    infos.put(s, infos.get(s) + 1);
//                }else {
//                    infos.put(s,1);
//                }
//            }
//        }
        System.out.println(infos);










    }
}
