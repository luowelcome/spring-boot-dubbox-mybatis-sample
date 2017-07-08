package com.lowell.gitlib.sbdms.facade.service;

import com.lowell.gitlib.sbdms.facade.config.RabbitMQConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HP on 2017/7/7.
 */
@Service
public class MsgSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send() {
        System.out.println("Lowell is sending massage!");
        rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_NAME, "Lowell is sending massage!");
    }
}
