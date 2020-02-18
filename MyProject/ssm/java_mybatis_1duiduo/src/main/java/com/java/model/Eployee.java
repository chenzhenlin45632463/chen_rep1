package com.java.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Eployee implements Serializable{
    private Integer id;
    private String name;
    private Integer deptId;
}
