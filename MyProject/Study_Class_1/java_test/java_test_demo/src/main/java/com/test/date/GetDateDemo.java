package com.test.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateDemo {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date end = sdf.parse("2019-11-27 21:00:00");
            long s = end.getTime()-(1000*60*60*6);
            System.out.println(end.getTime()/1000);
            System.out.println(s/1000);
            System.out.println(sdf.format(new Date(s)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
