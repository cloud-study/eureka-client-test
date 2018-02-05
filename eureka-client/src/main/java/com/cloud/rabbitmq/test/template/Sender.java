package com.cloud.rabbitmq.test.template;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/30 11:19
 * @description
 */
//@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(){
        //会产生一个字符串，并发送到名为hello的队列中
        String message = "Hello Word" + new Date();
        String queueName = "hello";
        rabbitTemplate.convertAndSend(queueName, message);

    }
}
