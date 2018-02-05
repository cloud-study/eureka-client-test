package com.cloud.consumer.controller;

import com.cloud.consumer.service.feignservice.ClientFeign;
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
public class ClientFeignController {
    @Autowired
    private ClientFeign clientFeign;
    @GetMapping("/getHelloWordByFeign")
    public ResponseEntity getHelloWordByFeign() {
        String str = clientFeign.getHelloWord();
        return ResponseEntity.ok(str);
    }

    @GetMapping("/getHelloWordErrorByFeign")
    public ResponseEntity getHelloWordErrorByFeign() {
        String str = clientFeign.getHelloWordError();
        return ResponseEntity.ok(str);
    }
}
