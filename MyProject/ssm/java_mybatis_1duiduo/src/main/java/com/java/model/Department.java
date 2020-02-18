package com.java.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class Department implements Serializable{
    private Integer id;
    private String name;
    private String adress;
    private List<Eployee> eployeeList;
}
