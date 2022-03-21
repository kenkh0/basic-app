package com.p141.d5_execption_javac;

import com.p128.d10_genericity.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        String date ="2015-01-12 10:23:21";

        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d =sdf. parse(date);
        System.out.println(d);


    }
}
