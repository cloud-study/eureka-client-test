package com.cloud.consumer.controller;

import com.cloud.consumer.service.feignservice.ClientFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/24 17:19
 * @description
 */
@RestController
@RequestMapping(value = "/api/eureka-consumer")
@Api(value = "服务调用-feign", description = "服务调用-feign")
public class ClientFeignController {
    @Autowired
    private ClientFeign clientFeign;

    @ApiOperation(value = "eureka-client：helloWord接口", httpMethod = "GET", response = ResponseEntity.class)
    @GetMapping("/getHelloWordByFeign")
    public ResponseEntity getHelloWordByFeign() {
        String str = clientFeign.getHelloWord();
        return ResponseEntity.ok(str);
    }

    @ApiOperation(value = "eureka-client：getHelloWordError接口", httpMethod = "GET", response = ResponseEntity.class)
    @GetMapping("/getHelloWordErrorByFeign")
    public ResponseEntity getHelloWordErrorByFeign() {
        String str = clientFeign.getHelloWordError();
        return ResponseEntity.ok(str);
    }
}
