package com.funtl.hello.spring.cloud.web.admin.feign.servicer.hystrix;

import com.funtl.hello.spring.cloud.web.admin.feign.servicer.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {

        return "Hi your message is :\""+message+"\" but request error. from feign";
    }
}
