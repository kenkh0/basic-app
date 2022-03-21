package com.p157_charset;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class test3 {
    public static void main(String[] args) throws IOException {
        File f= new File("E:\\javase_code\\basic-app\\src\\com\\oop-app2\\src\\data.txt");



        InputStream is =new FileInputStream(f);

        byte[] buffer =is.readAllBytes();
        System.out.println(new String(buffer));

        OutputStream os = new FileOutputStream("E:\\javase_code\\basic-app\\src\\com\\oop-app2\\src\\data.txt",true);

        os.write('a');
        os.write('b');
        os.write('c');
        os.write('b');


        System.out.println("3");
        os.write("\r\n".getBytes(StandardCharsets.UTF_8));
        os.write('a');
        os.write('b');
        os.write('c');
        os.write('c');
        os.write("\r\n".getBytes(StandardCharsets.UTF_8));
        os.flush();
        os.close();



    }
}
