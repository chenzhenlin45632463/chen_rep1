package com.java.jsonobject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    public Person() {
    }

    public Person(String name, String age, String url, String email) {
        this.name = name;
        this.age = age;
        this.url = url;
        this.email = email;
    }

    private String name;
    private String age;
    private String url;
    private String email;
}
