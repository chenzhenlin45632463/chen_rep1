package com.spring.high.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ScheduledService {

//    @Scheduled(cron = "0,1,2,3,4 * * * * MON-SAT")
//    @Scheduled(cron = "0 * * * * MON-SAT")
//    @Scheduled(cron = "0-40 * * * * MON-SAT")
//    @Scheduled(cron = "0/4 * * * * MON-SAT")//代表每四秒执行一次
    public void schedule(){
        log.info("[schedule]定时方法执行...");
    }
}
