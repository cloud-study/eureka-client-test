package com.cloud.datasourcetest.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/1 18:45
 * @description
 */
@Mapper
public interface TestMapper {
    List<Map<String, String>> getDefaultDate();

    List<Map<String, String>> getCustomData();
}
