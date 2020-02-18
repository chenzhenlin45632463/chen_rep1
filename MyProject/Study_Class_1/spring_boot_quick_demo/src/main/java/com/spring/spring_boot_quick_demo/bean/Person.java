package com.spring.spring_boot_quick_demo.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@Component
@ConfigurationProperties(prefix = "personal")
public class Person {
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;
    Map<String,String>map;
    List<Object>list;
    private Dog dog;
}
