package com.spring.high.ticket.service;

import com.spring.high.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.stereotype.Component;

//@EnableDubbo
@Component
@Service//将服务发布出去
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {

        return "厉害了，我的新电影《魔童降世：哪吒》";
    }
}
