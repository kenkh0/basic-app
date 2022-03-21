package com.p128.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("4");
        System.out.println(list);

        Iterator <String > it =list.iterator();
        while (it.hasNext()){
            String ele =it.next();
            if ("2".equals(ele)) {

                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("=======================");


        list.forEach(a->{

        });


    }
}
