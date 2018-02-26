package com.cloud.datasourcetest.controller;

import com.cloud.datasourcetest.service.ITestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "动态数据源", description = "动态数据源")
public class TestDataSourceController {
    @Autowired
    private ITestService testService;

    @ApiOperation(value = "默认数据源", httpMethod = "GET", response = ResponseEntity.class)
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "Authorization", value = "Authorization token",
//                    required = true, dataType = "string", paramType = "header")
//    })
    @RequestMapping("/getDefaultDate")
    public ResponseEntity getDefaultDate(){
        return ResponseEntity.ok(testService.getDefaultDate());
    }

    @ApiOperation(value = "其他数据源", httpMethod = "GET", response = ResponseEntity.class)
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "Authorization", value = "Authorization token",
//                    required = true, dataType = "string", paramType = "header")
//    })
    @RequestMapping("/getCustomData")
    public ResponseEntity getCustomData(){
        return ResponseEntity.ok(testService.getCustomData());
    }


}
