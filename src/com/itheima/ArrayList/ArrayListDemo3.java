package com.itheima.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String>list =new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("mysql");
        list.add("MYbatis");
        list.add("Html");

       String e =list.get(3);
        System.out.println(e);

        System.out.println(list.size());


        String getString="";
        for (int i = 0; i < list.size(); i++) {
            getString+=list.get(i);
        }
        System.out.println(getString);

        System.out.println(list);

        String R1=list.remove(1);

        System.out.println(R1);
        System.out.println("renveed "+list);

        boolean b = list.remove("MYbatis");
        if (b==true){
            System.out.println("deltelOK");
        }else {
            System.out.println("error");
        };

        System.out.println("renveed "+list);

        String e3 =list.set(0,"JJJJ");
        System.out.println("renveed "+list);
        System.out.println("renveed "+e3);


    }
}
