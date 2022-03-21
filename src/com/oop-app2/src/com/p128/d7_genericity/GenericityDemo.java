package com.p128.d7_genericity;

import java.util.ArrayList;
import java.util.List;

public class GenericityDemo {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>();

        list.add("Java");
        list.add("Java2");

        List <Object>list1 =new ArrayList();
        list1.add("java");
        list1.add(23.3);
        list1.add(false);
        list1.add("Spring");


    }
}
