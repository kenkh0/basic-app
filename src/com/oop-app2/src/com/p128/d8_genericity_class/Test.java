package com.p128.d8_genericity_class;

public class Test {
    public static void main(String[] args) {

        MyArrayList <String> list =new MyArrayList<>();

        list.add("java");
        list.add("My");
        list.add("java");
        list.remove("My");
        System.out.println(list);
        MyArrayList<Integer> list2 =new MyArrayList<>();

        list2.add(12);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.remove(3);
        System.out.println(list2);

    }
}
