package com.java.jsonobject.demo;

import com.alibaba.fastjson.JSONObject;
import com.java.jsonobject.model.Person;

public class JsonObjectDemo {
    public static void main(String[] args) {
        Person person = new Person("杨万里","36","www.ywl.com","ywl@163.com");
        JSONObject personJson = (JSONObject) JSONObject.toJSON(person);
        System.out.println(JSONObject.toJSONString(person));
        System.out.println(JSONObject.toJSONString(personJson));
    }
}
