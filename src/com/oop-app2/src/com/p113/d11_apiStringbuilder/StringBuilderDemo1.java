package com.p113.d11_apiStringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        sb.append(1);
        sb.append(false);
        sb.append(3.0);
        System.out.println(sb);

        StringBuilder sb1 =new StringBuilder();
        sb1.append("a").append("b").append("c").append("asd");
        System.out.println(sb1);


        sb1.reverse().append(110);
        System.out.println(sb1.length());

       String rs= sb1.toString();

    }


}


