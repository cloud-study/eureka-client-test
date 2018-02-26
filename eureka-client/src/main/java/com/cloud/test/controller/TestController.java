package com.cloud.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/24 15:17
 * @name
 * @description
 */
@RefreshScope
@RestController
@RequestMapping(value = "/api/eureka-client")
@Api(value = "测试", description = "测试")
public class TestController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${eureka-client.name}")
    private String helloWordStr;

    @ApiOperation(value = "读取配置参数", httpMethod = "GET", response = ResponseEntity.class)
    @RequestMapping(value = "/info")
    public ResponseEntity getInfo(){
        String services = "Services: " + discoveryClient.getServices();
        return ResponseEntity.ok(services);
    }

    @ApiOperation(value = "读取配置参数", httpMethod = "GET", response = ResponseEntity.class)
    @RequestMapping(value = "/helloWord")
    public ResponseEntity helloWord(){
        String str = helloWordStr;
        return ResponseEntity.ok(str);
    }

    @ApiOperation(value = "读取字符串", httpMethod = "GET", response = ResponseEntity.class)
    @RequestMapping(value = "/getHelloWordError")
    public ResponseEntity getHelloWordError(){
        String str = "error str";
        return ResponseEntity.ok(str);
    }

    @ApiOperation(value = "抛出异常", httpMethod = "GET", response = ResponseEntity.class)
    @RequestMapping(value = "/throwException")
    public ResponseEntity throwException(){
        throw new RuntimeException("throwException");
    }
}
