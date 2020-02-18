package head.com.demo01;

import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {

//        System.out.println(System.currentTimeMillis());
       /* Date date = new Date(120L);
        Date date2 = new Date(120);
        System.out.println(date);
        System.out.println(date2);*/
        Date date = new Date();
        long num = System.currentTimeMillis();
        System.out.println(num);
        System.out.println(date.getTime());
        System.out.println(new Date());
    }
}
