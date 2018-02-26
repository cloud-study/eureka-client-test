package com.cloud.consumer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "服务调用-ribbon", description = "服务调用-ribbon")
public class ClientRibbonController {
//    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation(value = "eureka-client：helloWord接口", httpMethod = "GET", response = ResponseEntity.class)
    @GetMapping("/getHelloWordByRibbon")
    public ResponseEntity getHelloWordByRibbon() {
        String url = "http://eureka-client/helloWord";
        String str = restTemplate.getForObject(url, String.class);
        return ResponseEntity.ok(str);
    }
}
