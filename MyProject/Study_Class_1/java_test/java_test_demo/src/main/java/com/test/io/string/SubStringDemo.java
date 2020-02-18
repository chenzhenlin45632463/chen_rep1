package com.test.io.string;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SubStringDemo {
    public static void main(String[] args) {
        String phone = "8618381121942";
        System.out.println(phone.substring(2));
    }

    @Test
    public void testMap(){
        Map map = new HashMap();
        map.put("1234567890","1234567890");
        map.put("12345678901234567890","12345678901234567890");
        map.put("123456789012345678901234567890","123456789012345678901234567890");
        System.out.println(dealAliyunParam(map));
    }

    private String dealAliyunParam(Map<String,String> param){
        Map<String, String> sendContentMap = new HashMap();
        for (String oldkey : param.keySet()) {
            String keyStr = oldkey.substring(2, oldkey.length() - 1);
            sendContentMap.put(keyStr, param.get(oldkey));
        }
        String dealParam = JSON.toJSONString(sendContentMap);
        return dealParam;
    }
}
