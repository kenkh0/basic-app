package com.itheima.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList <String>list = new ArrayList();
        int [] list1= {1,2,3,};
        list.add("java");
        list.add("java");
        list.add("java");
//        list.add(list1);

        System.out.println(list);


        list.add(1,"1");
        System.out.println(list);

        ArrayList <Integer>list2 = new ArrayList();
        list2.add(23);
        list2.add(23);

    }

}
