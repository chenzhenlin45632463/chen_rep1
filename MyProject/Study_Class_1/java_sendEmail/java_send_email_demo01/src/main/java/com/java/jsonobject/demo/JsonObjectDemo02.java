package com.java.jsonobject.demo;

import com.alibaba.fastjson.JSONObject;
import com.java.jsonobject.model.People;
import org.junit.Test;

public class JsonObjectDemo02 {

    @Test
    public void testParseObject(){
       String jsonString = "{'name':'杨万里','age':'39','address':'北宋','email':'ywl@163.com','number':'第五号'}";
        People people = JSONObject.parseObject(jsonString, People.class);
        System.out.println(people);
    }
}
