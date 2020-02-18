package com.chenwei.starte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication//web应用才生效
@EnableConfigurationProperties(MyProperties.class)
public class MyServiceAutoConfiguration {

    @Autowired
    MyProperties myProperties;

    @Bean
    public MyService myService(){
        MyService myService = new MyService();
        myService.setMyProperties(myProperties);
        return myService;
    }
}
