package com.example.springboot.activemq.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by pkpk1234 on 2017/7/4.
 */
@Service
public class MsgProducer {

    private final JmsTemplate jmsTemplate;

    @Autowired
    public MsgProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(String message) {
        this.jmsTemplate.send("jms.queue", new Msg(message));
    }
}
