package com.spring.high.provider.controller;

import com.spring.high.provider.service.TicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TicketController {

    @Resource
    TicketService ticketService;

    @RequestMapping(value = "/ticket")
    public String getTicket(){

        return ticketService.getTicket();
    }
}
