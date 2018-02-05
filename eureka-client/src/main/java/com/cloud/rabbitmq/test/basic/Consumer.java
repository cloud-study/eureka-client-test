package com.cloud.rabbitmq.test.basic;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/30 9:59
 * @description
 */
public class Consumer {
//    public static void main(String[] args)throws IOException, TimeoutException {
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
//        //声明队列
//        String queueName = channel.queueDeclare().getQueue();
//        String routingKey = "hello";
//
//        //绑定队列，通过键 routingKey 将队列和交换器绑定起来
//        channel.queueBind(queueName, exchangeName, routingKey);
//
//        while(true) {
//            //消费消息
//            boolean autoAck = false;
//            String consumerTag = "";
//            channel.basicConsume(queueName, autoAck, consumerTag, new DefaultConsumer(channel) {
//                @Override
//                public void handleDelivery(String consumerTag,
//                                           Envelope envelope,
//                                           AMQP.BasicProperties properties,
//                                           byte[] body) throws IOException {
//                    String routingKey = envelope.getRoutingKey();
//                    String contentType = properties.getContentType();
//                    System.out.println("消费的路由键：" + routingKey);
//                    System.out.println("消费的内容类型：" + contentType);
//                    long deliveryTag = envelope.getDeliveryTag();
//                    //确认消息
//                    channel.basicAck(deliveryTag, false);
//                    System.out.print("消费的消息体内容：");
//                    String bodyStr = new String(body, "UTF-8");
//                    System.out.println(bodyStr);
//
//                }
//            });
//        }
//    }
}
