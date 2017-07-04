package com.example.springboot.activemq;

import com.example.springboot.activemq.message.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by pkpk1234 on 2017/7/4.
 */
@Component
public class Initializer implements CommandLineRunner {
    private final MsgProducer msgProducer;

    @Autowired
    public Initializer(MsgProducer msgProducer) {
        this.msgProducer = msgProducer;
    }

    @Override
    public void run(String... args) throws Exception {
        this.msgProducer.sendMessage("test message a");
        this.msgProducer.sendMessage("test message b");
    }
}
