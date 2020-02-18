package com.test.http;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
    public static void main(String[] args) {
        String jurl ="https://openapi.digifinex.vip/v3/kline?end_time=1574675168&period=1&start_time=1574653526&symbol=ZMTK_USDT";
        try {
            //打开URLConnection进行读取
            URL url = new URL(jurl);
            URLConnection connection = url.openConnection();
            try (InputStream in = connection.getInputStream()){    //带资源的try-catch语句。自动关闭
                InputStream buffer = new BufferedInputStream(in);
                //将InputStream串链到一个Reader
                Reader reader = new InputStreamReader(buffer);
                int c;
                String count = "";
                while ((c = reader.read())!= -1) {
//                    System.out.print((char)c);
                    count+=(char)c;
                }
                System.out.println(count);

            } catch (MalformedURLException e) {

            }
        } catch (IOException e) {

        }
    }
}
