package com.cloud.datasourcetest.service;

import java.util.List;
import java.util.Map;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/1 18:44
 * @description
 */
public interface ITestService {

    List<Map<String, String>> getDefaultDate();

    List<Map<String, String>> getCustomData();
}
