package com.springboot.spring_boot30.controller;

import com.springboot.spring_boot30.exception.UserNotExistException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class TestExcController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String testExc(String user){
        log.info("[test_param]user={}",user);
        if (!StringUtils.isEmpty(user) &&user.equals("admin")){
            return "success";
        }else {
            throw new UserNotExistException();
        }
    }
}
