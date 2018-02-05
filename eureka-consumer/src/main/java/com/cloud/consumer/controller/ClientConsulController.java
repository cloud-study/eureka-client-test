package com.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/24 16:00
 * @description
 */
@RestController
@RequestMapping(value = "/api/eureka-consumer")
public class ClientConsulController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
//    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getClientInfo")
    public ResponseEntity getClientInfo() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/info";
        System.out.println(url);
        return ResponseEntity.ok(restTemplate.getForObject(url, String.class));
    }

    @GetMapping("/getClientHelloWord")
    public ResponseEntity getClientHelloWord() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/helloWord";
        System.out.println(url);
        return ResponseEntity.ok(restTemplate.getForObject(url, String.class));
    }
}
