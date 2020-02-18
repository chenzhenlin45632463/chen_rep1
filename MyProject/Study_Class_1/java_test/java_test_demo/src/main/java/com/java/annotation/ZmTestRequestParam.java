package com.java.annotation;

import com.java.patten.RegexpPattenDemo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class ZmTestRequestParam implements Serializable {

    @NotNull(message = "username is null,it's wrong")
    private String username;
    @NotBlank(message = "password is invalid")
    private String password;
    @NotBlank(message = "email is invalid")
    private String email;

    @Pattern(regexp = RegexpPattenDemo.PHONE_NUMBER_REGEXP)
    private String mobile;

    @Pattern(regexp = RegexpPattenDemo.PHONE_AREA_NUMBER_REGEXP)
    private String phoneArea;

}
