package head.com.demo01;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpDFDemo {
    public static void main(String[] args) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = df.parse("2017-3-56 17:32:1234");
        System.out.println(date);
        System.out.println(df.format(date));
        String format = df.format(date);
        System.out.println(format);
        System.out.println(new Date());
    }

    @Test
    public void test() {
        String birthday = "1952年7月23日 14:47:4";
        DateFormat dft = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        try {
            Date date = dft.parse(birthday);
            System.out.println(date);
            System.out.println(date.getTime());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
