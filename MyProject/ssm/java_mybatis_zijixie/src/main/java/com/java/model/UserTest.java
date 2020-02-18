package com.java.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class UserTest implements Serializable{
    private Integer userId;
    private String userName;
    private String userNumber;
    private String userEmail;
    private Integer userAge;
    private String userAddress;
}
