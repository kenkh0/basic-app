package com.p113.d10_api_objects;

import java.util.Objects;

public class Test {

    public static void main(String[] args) {
        String s1 =null;
        String s2 =new String("ken");

//        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));
    }
}
