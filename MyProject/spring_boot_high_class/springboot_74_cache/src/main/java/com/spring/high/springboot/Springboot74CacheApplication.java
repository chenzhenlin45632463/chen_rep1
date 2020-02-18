package com.spring.high.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//开始基于注解的缓存
@EnableCaching
@MapperScan(value = "com.spring.high.springboot.mapper")
@SpringBootApplication
public class Springboot74CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot74CacheApplication.class, args);
    }

}
