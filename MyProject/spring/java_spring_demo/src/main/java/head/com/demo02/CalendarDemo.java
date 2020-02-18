package head.com.demo02;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.DATE));
    }

}
