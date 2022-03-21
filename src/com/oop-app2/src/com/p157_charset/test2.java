package com.p157_charset;

import java.io.*;

public class test2 {
    public static void main(String[] args) throws IOException {
        File f= new File("E:\\javase_code\\basic-app\\src\\com\\oop-app2\\src\\data.txt");

        InputStream is =new FileInputStream(f);

        byte[] buffer =is.readAllBytes();
        System.out.println(new String(buffer));

    }
}
