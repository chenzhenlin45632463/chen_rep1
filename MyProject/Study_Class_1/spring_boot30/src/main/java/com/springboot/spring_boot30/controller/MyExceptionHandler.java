package com.springboot.spring_boot30.controller;

import com.springboot.spring_boot30.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/***
 * 自定义异常处理器
 */
@ControllerAdvice
public class MyExceptionHandler {

    /*@ResponseBody
    @ExceptionHandler(UserNotExistException.class)
    public Map<String,Object> handException(Exception e){
        Map<String, Object> map = new HashMap<>();
        map.put("code","user.not exist");
        map.put("message",e.getMessage());
        return map;
    }*/

    @ExceptionHandler(UserNotExistException.class)
    public String handMyselfException(Exception e, HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user.not exist");
        map.put("message",e.getMessage());
        return "forward:/error";
    }
}
