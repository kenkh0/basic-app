package com.p121.d3_calender;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo01 {
    public static void main(String[] args) {
        Calendar cal= Calendar.getInstance();

        System.out.println(cal);

        int Year =cal.get(Calendar.YEAR);
        System.out.println(Year);

        int mm =cal.get(Calendar.MONTH)+1;
        System.out.println(mm);

        int dd =cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(dd);

        cal.add(Calendar.DAY_OF_YEAR,64);

        Date d =cal.getTime();
        System.out.println(d);




    }
}
