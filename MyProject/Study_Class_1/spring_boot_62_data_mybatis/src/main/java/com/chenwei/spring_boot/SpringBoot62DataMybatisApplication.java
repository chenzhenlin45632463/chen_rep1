package com.chenwei.spring_boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.chenwei.spring_boot.mapper")
@SpringBootApplication
public class SpringBoot62DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot62DataMybatisApplication.class, args);
    }

}
