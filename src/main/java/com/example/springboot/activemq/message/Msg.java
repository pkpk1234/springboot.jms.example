package com.example.springboot.activemq.message;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by pkpk1234 on 2017/7/4.
 */
public class Msg implements MessageCreator {

    private String playLoad;

    public Msg(String playLoad) {
        this.playLoad = playLoad;
    }

    @Override
    public Message createMessage(Session session) throws JMSException {
        return session.createTextMessage(playLoad);
    }
}
