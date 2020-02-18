package com.test.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {
    public static void main(String[] args) {
        Date now = new Date();
        Date date = offsiteDate(now, Calendar.MINUTE, -360);
        long after = now.getTime() - (1000 * 60 * 60 * 6l);
        Date zhihou = new Date(after);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String a = sdf.format(now);
        String b = sdf.format(date);
        String c = sdf.format(zhihou);
        System.out.println("start :"+b);
        System.out.println("after :"+c);
        System.out.println(b.equals(c));
        System.out.println("end :"+a);
        System.out.println(now.getTime()-date.getTime());
    }

    public static Date offsiteDate(Date date, int calendarField, int offsite) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(calendarField, offsite);
        return cal.getTime();
    }
}
