package com.example.springboot.activemq.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by pkpk1234 on 2017/7/4.
 */
@Component
@Slf4j
public class MsgConsumer {

    @JmsListener(destination = "jms.queue")
    public void receiveMessage(String message) {

        log.info("receive jms message: {} at {}",message,new Date());
    }
}
