package com.spring.high.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot默认支持两种技术来和ES交互
 * 1、Jest（默认不生效)
 * 需要导入jest的工具包（io.searchbox.client.JestClient）
 * 2、spring Data ElasticSearch
 */
@SpringBootApplication
public class Springboot93ElasticApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot93ElasticApplication.class, args);
    }

}
