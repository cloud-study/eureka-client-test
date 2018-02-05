package com.cloud.datasourcetest.service.impl;

import com.cloud.datasource.TargetDatasource;
import com.cloud.datasourcetest.mapper.TestMapper;
import com.cloud.datasourcetest.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/1 18:45
 * @description
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Map<String, String>> getDefaultDate() {
        return testMapper.getDefaultDate();
    }

    @Override
    @TargetDatasource(name = "sub")
    public List<Map<String, String>> getCustomData() {
        return testMapper.getCustomData();
    }
}
