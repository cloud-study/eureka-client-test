package com.cloud.datasourcetest.controller;

import com.cloud.datasourcetest.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/1 18:43
 * @description
 */
@RestController
@RequestMapping(value = "/api/eureka-client")
public class TestDataSourceController {
    @Autowired
    private ITestService testService;

    @RequestMapping("/getDefaultDate")
    public ResponseEntity getDefaultDate(){
        return ResponseEntity.ok(testService.getDefaultDate());
    }

    @RequestMapping("/getCustomData")
    public ResponseEntity getCustomData(){
        return ResponseEntity.ok(testService.getCustomData());
    }


}
