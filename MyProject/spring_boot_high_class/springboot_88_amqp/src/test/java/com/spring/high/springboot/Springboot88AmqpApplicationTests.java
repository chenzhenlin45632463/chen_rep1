package com.spring.high.springboot;

import com.spring.high.springboot.bean.Book;
import com.spring.high.springboot.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot88AmqpApplicationTests {

    @Resource
    RabbitTemplate rabbitTemplate;

    @Resource
    AmqpAdmin amqpAdmin;


    //通过admin创建exchange
    @Test
    public void createExchange(){
//创建exchange
        amqpAdmin.declareExchange(new DirectExchange("myAdminDirect"));
        //删除exchange
//        amqpAdmin.deleteExchange("adminDirect");

//        创建queue
//        amqpAdmin.declareQueue(new Queue("myAdminDirect.queue",true));

//        创建绑定规则
        amqpAdmin.declareBinding(new Binding("myAdminDirect.queue", Binding.DestinationType.QUEUE,"myAdminDirect","myAdminDirect.key1",null));

        log.info("[createExchange]method complete");
    }

    //direct交换器向队列发送消息
    @Test
    public void contextLoads() {

        rabbitTemplate.convertAndSend("myDirect","atguigu",new User("陈陈同学",25));
    }

    //接受消息
    @Test
    public void receiveMessage(){

        Object message = rabbitTemplate.receive("atguigu.emps");
        System.out.println(message);
    }

    //fanout交换器向队列发送消息
    @Test
    public void fanoutSend() {

        rabbitTemplate.convertAndSend("myFanont","atguigu",new Book("笑傲江湖","金庸"));
    }
}
