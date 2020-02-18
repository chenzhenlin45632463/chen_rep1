package com.java.json;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Map;

public class JsonToMapDemo {
    public static void main(String[] args) {
        String str = "{${validateCode}=969933}";
        String[] split = str.split("=");
        String s = split[1].split("}")[0];
        System.out.println(s);
       /* str = str.replace("=", ":");
        System.out.println(str);
        Map<String, Long> map = JSONObject.parseObject(str, Map.class);
        System.out.println(map);*/
    }

    @Test
    public void testParseJson(){
        String str = "{${validateCode}=969933}";
        String j1 = "{'ww':'aa'}";
        Map<String,String> map = JSONObject.parseObject(j1, Map.class);
        System.out.println(map);
    }
}
