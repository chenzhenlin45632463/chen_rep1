package com.java.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class User implements Serializable{

    private Integer id;
    private String name;
    private String number;
    private String email;
    private Integer age;
    private String address;
    private AboutUser aboutUser;
}
