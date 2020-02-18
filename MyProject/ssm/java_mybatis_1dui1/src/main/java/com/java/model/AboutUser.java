package com.java.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter
@Setter
@ToString
public class AboutUser implements Serializable {
    private Integer id;
    private String name;
    private Integer uid;
}
