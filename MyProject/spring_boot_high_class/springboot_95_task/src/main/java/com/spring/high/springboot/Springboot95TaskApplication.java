package com.spring.high.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//开启基于注解的定时任务
@EnableAsync//开启基于注解的异步执行
@SpringBootApplication
public class Springboot95TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot95TaskApplication.class, args);
    }

}
