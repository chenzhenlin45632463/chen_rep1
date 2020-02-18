package com.java.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
@Setter
public class Account implements Serializable {

    private Integer id;

    private String name;//用户

    private Integer balance;//资金
}
