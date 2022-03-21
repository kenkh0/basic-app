package com.p154;

import java.io.File;
import java.io.IOException;

public class fileDemo02 {
    public static void main(String[] args) throws IOException {
        File f= new File("oop-app2\\src\\com\\p154\\New Text Document.txt");


        File f1= new File("C:\\Users\\Work\\Pictures");

        String [] apple = f1.list();
        for (String s : apple) {
            System.out.println(s);
        }
        System.out.println("========");
        File [] files =f1.listFiles();

        for (File file : files) {
            System.out.println(file);
        }

    }
}
