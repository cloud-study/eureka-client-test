package com.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/24 16:25
 * @description
 */
@RestController
@RequestMapping(value = "/api/eureka-consumer")
public class ClientRibbonController {
//    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getHelloWordByRibbon")
    public ResponseEntity getHelloWordByRibbon() {
        String url = "http://eureka-client/helloWord";
        String str = restTemplate.getForObject(url, String.class);
        return ResponseEntity.ok(str);
    }
}
