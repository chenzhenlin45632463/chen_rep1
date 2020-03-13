package com.funtl.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "hiError")//指定注解下的需要被熔断的方法和回滚方法
    public String sayHi(String message){

        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message="+message,String.class);
    }

    //出现网络故障或者问题时开启熔断回滚的方法
    public String hiError(String message){

        return "Hi, your message is :\""+message+"\"but request error. this from ribbon";
    }
}
