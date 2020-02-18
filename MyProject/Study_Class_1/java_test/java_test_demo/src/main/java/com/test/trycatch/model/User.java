package com.test.trycatch.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class User implements Serializable {
    private String username;
    private String password;
    private String email;
    private String address;
    private String number;
    private Integer age;
}
