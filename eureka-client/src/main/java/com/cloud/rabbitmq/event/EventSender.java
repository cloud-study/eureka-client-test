package com.cloud.rabbitmq.event;

import com.cloud.event.basic.Event;
import com.cloud.event.client.EventClientFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "异步事件", description = "异步事件")
public class EventSender {
    @Autowired
    private EventClientFeign eventClient;

    @ApiOperation(value = "异步事件测试", httpMethod = "GET", response = ResponseEntity.class)
    @RequestMapping(value = "eventSender")
    public ResponseEntity eventSender(){
        eventClient.publishPublicEvent(new Event().setDestinationService("eureka-consumer")
                .setEventName("testEventTest")
                .addEventArgument("param1", "param1")
                .addEventArgument("param2", "param2"));
        return ResponseEntity.ok(true);
    }
}
