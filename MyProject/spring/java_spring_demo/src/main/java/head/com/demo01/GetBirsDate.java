package head.com.demo01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GetBirsDate {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入出生日期,格式:yyyy-MM-dd-HH:mm:ss");
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.next();
//        String birthday = "1970年1月1日 8:0:0";
        System.out.println(birthday);
        long day = getDay(birthday);
        System.out.println("您今年"+day/(30*12)+"岁了");
    }

    private static long getDay(String birthday) throws Exception {
        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        Date date = dft.parse(birthday);
        long bornTime = date.getTime();
        System.out.println(bornTime);
        long nowTime = System.currentTimeMillis();
        long day = 1000 * 60 * 60 * 24;

        if ((nowTime - bornTime) % day > 0) {
            long days = (nowTime - bornTime) / day + 1;
            return days;
        } else {
            return (nowTime - bornTime) / day;
        }
    }

}
