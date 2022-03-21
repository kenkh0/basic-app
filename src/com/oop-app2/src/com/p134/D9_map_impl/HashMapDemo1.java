package com.p134.D9_map_impl;

import com.p134.d1_set.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
    public static void main(String[] args) {

        Map<Student, String> maps =new HashMap<>();

        Student s1=new Student("apple",20,'M');
        Student s2=new Student("apple",20,'M');
        Student s3=new Student("apple",20,'M');

        maps.put(s1,"hk");
        maps.put(s1,"ch");
        maps.put(s1,"ff");
        System.out.println(maps);

    }
}
