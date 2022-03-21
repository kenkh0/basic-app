package com.p157_charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String name ="abc自由的百科全书";
        byte [] bytes=name.getBytes("GBK");


        System.out.println(Arrays.toString(bytes));

        String rs = new String(bytes,"GBK");
        System.out.println(rs);
    }
}
