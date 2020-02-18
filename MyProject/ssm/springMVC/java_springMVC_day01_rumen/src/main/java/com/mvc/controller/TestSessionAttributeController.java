package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller()
@RequestMapping("/anNo")
@SessionAttributes(value = {}, types = {String.class, Integer.class})
public class TestSessionAttributeController {

    @RequestMapping("/testZongHe")
    public String testZongHe(SessionStatus sessionStatus, ModelMap map, Model model, String name, String email) {
        model.addAttribute("name", name);
        model.addAttribute("age", 45);
        model.addAttribute("email", "刘新成@1234");
        model.addAttribute("number", 20);
        sessionStatus.setComplete();
        System.out.println(map.get("name") + ":" + map.get("age") +":"+ map.get("email") +":"+ map.get("number"));
        return "first";
    }
    @RequestMapping("/testPut")
    public String testPut(Model model) {
        model.addAttribute("name", "陈巍");
        model.addAttribute("age", "24");
        model.addAttribute("email", "cw@1234");
        model.addAttribute("number", 35);
        return "first";
    }

    @RequestMapping("/testGet")
    public String testGet(ModelMap model) {
        System.out.println(model.get("name") + "" + model.get("age") + model.get("email") + model.get("number"));
        return "first";
    }

    @RequestMapping("/testClean")
    public String testClean(SessionStatus sessionStatus) {
        sessionStatus.setComplete();

        return "first";
    }


}
