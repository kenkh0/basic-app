package com.p134.d1_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {

        Set<Student > sets =new HashSet<>();
        Student s1 =new Student("apple",20,'M');
        Student s2 =new Student("apple",20,'M');
        Student s3 =new Student("banana",21,'M');
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);

        System.out.println(sets);

    }
}
