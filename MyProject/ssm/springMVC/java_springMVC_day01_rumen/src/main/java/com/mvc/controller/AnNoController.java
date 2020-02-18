package com.mvc.controller;

import com.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.lang.model.element.VariableElement;
import java.util.Date;
import java.util.Map;

@RequestMapping("/anNo")
@Controller
public class AnNoController {

    /*@ModelAttribute
    public void init(Map<String,User> Map,User user){
        user.setPassword("嵩山");
        user.setEmail("cw@123");
        user.setAge(34);
        user.setDate(new Date());
        System.out.println("初始化user:"+user);
        Map.put("mj",user);
//        return user;
    }*/
/*
    @ModelAttribute
    public void testString(Map<String,User>map,String name){
        User user = new User();
        user.setName("余沧海");
        user.setPassword("青城山");
        user.setEmail("ych@");
        user.setAge(59);
        user.setDate(new Date());
        System.out.println("test:"+user);
        map.put("令狐冲",user);
    }*/
    @ModelAttribute
    public User nextString(String name){
        User user = new User();
        user.setName("左冷禅");
        user.setPassword("嵩山");
        user.setEmail("zlc@");
        user.setAge(43);
        user.setDate(new Date());
        System.out.println("next:"+user);
        return user;
    }
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(/*@ModelAttribute("令狐冲")*/User user){

        System.out.println(user);

        return "first";
    }



}
