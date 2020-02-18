package com.spring.high.provider.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TicketService {


    public String getTicket(){
        log.info("8002...");
        return "《厉害了，我的陈陈同学》";
    }
}
