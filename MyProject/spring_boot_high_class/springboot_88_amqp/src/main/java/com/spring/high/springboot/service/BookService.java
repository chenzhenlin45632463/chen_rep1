package com.spring.high.springboot.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @RabbitListener(queues = "atguigu.news")
    public void receive(Object o){
        System.out.println("object_ :"+o);
    }

    @RabbitListener(queues = "atguigu")
    public void receive2(Message message){
        System.out.println("m_b :"+message.getBody());
        System.out.println("m_p :"+message.getMessageProperties());
    }
}
