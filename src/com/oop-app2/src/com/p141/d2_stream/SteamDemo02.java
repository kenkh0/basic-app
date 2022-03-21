package com.p141.d2_stream;

import java.util.*;
import java.util.stream.Stream;

public class SteamDemo02 {
    public static void main (String[]args){
        Collection<String> list=new ArrayList<>();
        Stream<String> s = list.stream();


        Map<String,Integer> maps =new HashMap<>();

        Stream <String > keyStream = maps.keySet().stream();

        Stream<Integer> valueStream = maps.values().stream();

        Stream<Map.Entry <String,Integer>> keyAndValueStream =maps.entrySet().stream();

        System.out.println("==============");


        String [] name ={"a","b","C","D"};
        Stream<String>nameStream = Arrays.stream(name);

        Stream<String> nameStream2=Stream.of(name);



    }

}
