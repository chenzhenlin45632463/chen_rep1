package com.spring.high.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class AsyncService {


    @Async//告诉spring这是一个异步方法
    public void async(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("[service_async]异步执行...");
    }
}
