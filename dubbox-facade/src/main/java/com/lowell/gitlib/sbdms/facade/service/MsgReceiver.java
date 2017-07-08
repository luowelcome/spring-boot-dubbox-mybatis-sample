package com.lowell.gitlib.sbdms.facade.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HP on 2017/7/7.
 */
@Service
public class MsgReceiver {


    private static final Logger log = LoggerFactory.getLogger(MsgReceiver.class);

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RabbitListener(queues = "spring-boot-simple")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}
