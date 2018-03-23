package com.cloud.datasourcetest.controller;

import com.cloud.datasourcetest.service.IDataSourceTransactionsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/26 20:35
 * @description
 */
@RestController
@RequestMapping("/api/eureka-client")
@Api(value = "动态数据源-事务", description = "动态数据源-事务")
public class DataSourceTransactionController {
    @Autowired
    private IDataSourceTransactionsService dataSourceTransactionsService;

    @ApiOperation(value = "多数据源插入", httpMethod = "GET", response = ResponseEntity.class)
    @RequestMapping("/insertTransaction")
    public ResponseEntity insertTransaction(){
        dataSourceTransactionsService.insertTransaction();
        return ResponseEntity.ok(HttpEntity.EMPTY);
    }
}
