package com.cloud.rabbitmq.event;

import com.cloud.event.basic.Event;
import com.cloud.event.client.EventClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/30 20:33
 * @description
 */
@RestController
@RequestMapping(value = "/api/eureka-client")
public class EventSender {
    @Autowired
    private EventClientFeign eventClient;

    @RequestMapping(value = "eventSender")
    public ResponseEntity eventSender(){
        eventClient.publishPublicEvent(new Event().setDestinationService("eureka-consumer")
                .setEventName("testEventTest")
                .addEventArgument("param1", "param1")
                .addEventArgument("param2", "param2"));
        return ResponseEntity.ok(true);
    }
}
