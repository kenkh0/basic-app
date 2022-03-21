package com.p141.d7_exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo02 {
    public static void main(String[] args)   {

        System.out.println("Star");
        prseTime("2011-11-11 11:11:11");

        System.out.println("End");

    }

    private static void prseTime(String date)   {
        try {
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d =sdf.parse(date);
            System.out.println(d);
        } catch (ParseException e) {
            System.out.println("show eParseExcetopme");
        }

        try {
            InputStream is =new FileInputStream("E:/erer");
        } catch (FileNotFoundException e) {
            System.out.println("no file");
        }
    }
}
