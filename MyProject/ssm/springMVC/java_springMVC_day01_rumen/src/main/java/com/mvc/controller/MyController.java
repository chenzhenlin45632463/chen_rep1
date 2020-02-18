package com.mvc.controller;

import com.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/myController")
public class MyController {

    @GetMapping("/find")
    public String find(){

        System.out.println("welcome");

        return "success";
    }


    @RequestMapping("/user")
    public String user(User user){

        System.out.println(user);

        return "success";
    }

    @RequestMapping("/servletApi")
    public String servletApi(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request.getSession());
        System.out.println(request.getSession().getServletContext());
        System.out.println(response);
        return "success";
    }

    @RequestMapping("/requestBodyTest")
    public String requestBodyTest(@RequestBody(required = false) String body){
        System.out.println(body);

        return "first";
    }
}
