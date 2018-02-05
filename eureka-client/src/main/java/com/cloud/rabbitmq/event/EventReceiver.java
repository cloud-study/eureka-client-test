package com.cloud.rabbitmq.event;

import com.cloud.event.basic.NotificationEvent;
import com.cloud.event.basic.Topic;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/30 20:34
 * @description
 */
@Component
public class EventReceiver {

    @Topic(name = "testEventTest")
    public void eventReceiver(NotificationEvent event){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map<String, String> map = new HashMap<>(16);
        map.put("param1", event.getArgument("param1"));
        map.put("param2", event.getArgument("param2"));
        System.out.println(map + " eureka-client");
    }

    @Topic(name = "testEvent")
    public void eventReceivertestEvent(NotificationEvent event){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map<String, String> map = new HashMap<>(16);
        map.put("param1", event.getArgument("param1"));
        map.put("param2", event.getArgument("param2"));
        System.out.println(map+ " eureka-client");
    }
}
