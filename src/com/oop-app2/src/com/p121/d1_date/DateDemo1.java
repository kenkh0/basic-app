package com.p121.d1_date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date d =new Date();

        System.out.println(d);


        long time =d.getTime();
        System.out.println(time);

        long time1 =System.currentTimeMillis();
        System.out.println(time1);

        System.out.println("--------------");
        long time2 =System.currentTimeMillis();
        System.out.println(time2);
        time2+=(60*60+121)*1000;

        System.out.println(time2);

        Date d2 =new Date (time2);
        System.out.println(d2);
    }
}
