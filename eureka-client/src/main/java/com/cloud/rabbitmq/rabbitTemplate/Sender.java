package com.cloud.rabbitmq.rabbitTemplate;

import com.cloud.event.client.EventClientFeign;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/31 15:36
 * @description
 */
//@RestController
//@RequestMapping(value = "/api/eureka-client")
public class Sender {
    @Autowired
    private EventClientFeign eventClient;

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping(value = "/template/Sender")
    public ResponseEntity sender(){
        rabbitTemplate.convertAndSend("eureka-client", "test rabbitTemplate");
        return ResponseEntity.ok(true);
    }
}