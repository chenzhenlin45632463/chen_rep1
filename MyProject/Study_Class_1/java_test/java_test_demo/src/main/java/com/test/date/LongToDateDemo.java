package com.test.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LongToDateDemo {
    public static void main(String[] args) {
        Date date = new Date(1574652477000l);
        Date date2 = new Date(1574674093000l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        System.out.println(sdf.format(date2));
    }
}
