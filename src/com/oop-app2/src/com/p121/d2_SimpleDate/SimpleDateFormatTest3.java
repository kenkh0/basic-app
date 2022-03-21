package com.p121.d2_SimpleDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest3 {
    public static void main(String[] args) throws ParseException {

        String starTime ="2021-11-11 00:00:00";
        String endTime ="2021-11-11 00:10:00";

        String ATime ="2021-11-11 00:03:47";
        String BTime ="2021-11-11 00:10:11";


        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

       Date d1 =sdf.parse(starTime);
       Date d2 =sdf.parse(endTime);
       Date d3 =sdf.parse(ATime);
       Date d4 =sdf.parse(BTime);

       if(d3.after(d1)&& d3.before(d2)){
           System.out.println("d3ok");
       }
        if(d4.after(d1)&& d4.before(d2)){
            System.out.println("d4ok");
        }


//        sdf.format(d);
//        System.out.println(d);

    }
}
