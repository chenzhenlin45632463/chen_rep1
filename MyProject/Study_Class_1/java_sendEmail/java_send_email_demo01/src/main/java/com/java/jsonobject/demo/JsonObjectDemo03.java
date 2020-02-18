package com.java.jsonobject.demo;

import com.alibaba.fastjson.JSONObject;
import com.java.jsonobject.model.Person;
import org.junit.Test;

public class JsonObjectDemo03 {
    @Test
    public void testToJson(){
        Person person = new Person();
        person.setName("辛弃疾");
        person.setAge("35");
        person.setEmail("山东");
        person.setUrl("www.xqj.com");

        JSONObject jsonPerson = (JSONObject) JSONObject.toJSON(person);
        System.out.println(jsonPerson);
        Object name = jsonPerson.get("name");
        System.out.println(name);
    }

    @Test
    public void testValueOf(){
        String number = "1766443332243433223231";
        Long num = Long.parseLong(number);//报NumberFormatException异常的方法
        System.out.println(num);
    }
}
