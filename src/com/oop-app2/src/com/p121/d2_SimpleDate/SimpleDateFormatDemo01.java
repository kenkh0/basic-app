package com.p121.d2_SimpleDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {

        Date d =new Date();
        System.out.println(d);


        SimpleDateFormat sdf =new SimpleDateFormat("yyyyMMdd HH:mm:ss EEE a ");
            String rs =sdf.format(d);
        System.out.println(rs
        );

        System.out.println("===========");
        long time1 =System.currentTimeMillis();
        String rs2= sdf.format(time1);

        System.out.println(rs2);
    }
}
