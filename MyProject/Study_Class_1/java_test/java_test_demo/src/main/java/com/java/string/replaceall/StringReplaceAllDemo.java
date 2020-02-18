package com.java.string.replaceall;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StringReplaceAllDemo {
    public static void main(String[] args) {
        String content = "【ZMTK】尊敬的用户，您正在使用验证码绑定自己的邮箱，验证码是：${validateCode}。请勿向任何人包括客服提供验证码。";
        Map<String, String> map = new HashMap<String, String>();
        map.put("${validateCode}", "1124");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            content = content.replace(entry.getKey(),entry.getValue());
        }
        System.out.println(content);
    }

    @Test
    public void testString(){
        String content = "验证码是：${validateCode}。";
        String replace = content.replace("${validateCode}", "1134");
        System.out.println(content);
        System.out.println(replace);
    }
}

