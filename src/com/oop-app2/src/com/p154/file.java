package com.p154;

import java.io.File;
import java.text.SimpleDateFormat;

public class file {
    public static void main(String[] args) {

        File f1 = new File("C:\\Users\\Work\\Pictures\\1.jpg");

        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println(f1.length());

        long time = f1.lastModified();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:MM:SS").format(time));

        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println("================================");

        File f2 = new File("src\\logback.xml");

        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getPath());
        System.out.println(f2.getName());
        System.out.println(f2.length());

        long time1 = f2.lastModified();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:MM:SS").format(time1));

        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());

    }
}
