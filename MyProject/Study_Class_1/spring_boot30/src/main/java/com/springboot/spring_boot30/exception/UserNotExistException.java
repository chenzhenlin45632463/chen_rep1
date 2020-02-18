package com.springboot.spring_boot30.exception;

/***
 * 用户不存在异常；用来自定义 请求出错 的json数据
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("user is not exist,what's your problem ?");
    }
}
