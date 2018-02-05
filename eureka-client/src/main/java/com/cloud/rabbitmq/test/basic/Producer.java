package com.cloud.rabbitmq.test.basic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/30 9:48
 * @description
 */
public class Producer {
//    public static void main(String[] args) throws IOException, TimeoutException {
//        ConnectionFactory factory = new ConnectionFactory();
//        factory.setUsername("guest");
//        factory.setPassword("guest");
//        factory.setHost("localhost");
//        Connection conn = factory.newConnection();
//        //获得信道
//        Channel channel = conn.createChannel();
//        //声明交换器
//        String exchangeName = "test-exchange";
//        channel.exchangeDeclare(exchangeName, "direct",true);
//
//        String routingKey = "hello";
//        //发布消息
//        byte[] message = "Hello word".getBytes();
//        channel.basicPublish(exchangeName, routingKey, null, message);
//
//        channel.close();
//        conn.close();
//
//
//    }
}
