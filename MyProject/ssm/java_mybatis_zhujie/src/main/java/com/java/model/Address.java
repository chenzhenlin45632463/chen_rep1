package com.java.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Address implements Serializable{

    private Long id;
    private String userId;
    private String provinceId;
    private String cityId;
    private String townId;
    private String mobile;
    private String address;
    private String contact;
    private String isDefault;
    private String notes;
    private Date createDate;
    private String alias;


}
