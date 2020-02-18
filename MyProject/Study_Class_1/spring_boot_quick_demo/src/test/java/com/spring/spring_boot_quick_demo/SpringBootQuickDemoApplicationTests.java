package com.spring.spring_boot_quick_demo;

import com.spring.spring_boot_quick_demo.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootQuickDemoApplicationTests {
    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        log.trace("this is trace");
        log.debug("this is debug");
        //info  级别
        log.info("this is info");
        log.warn("this is warn");
        log.error("this is error");
//        System.out.println(person);
    }

}
