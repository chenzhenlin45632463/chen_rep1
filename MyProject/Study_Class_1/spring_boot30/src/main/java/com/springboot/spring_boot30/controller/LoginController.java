package com.springboot.spring_boot30.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String login(@RequestParam String username, @RequestParam String password, Map<String, Object> map, HttpSession session) {

        //判断登录用户名
        if (!StringUtils.isEmpty(username) && username.equals("admin")) {

            //判断密码
            if (!StringUtils.isEmpty(password) && password.equals("root")) {
                //登陆成功，将用户信息存入session域中，转到员工列表
                session.setAttribute("loginUser",username);
                return "redirect:/main.html";
            } else {
                map.put("msg", "password is wrong");
            }
        } else {
            map.put("msg", "username is wrong");
        }

        return "login";
    }
}
