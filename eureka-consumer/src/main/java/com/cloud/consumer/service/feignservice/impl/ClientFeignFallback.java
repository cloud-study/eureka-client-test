package com.cloud.consumer.service.feignservice.impl;

import com.cloud.consumer.service.feignservice.ClientFeign;
import org.springframework.stereotype.Component;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/25 10:37
 * @name
 * @description
 */
@Component
public class ClientFeignFallback implements ClientFeign{
    @Override
    public String getHelloWord() {
        throw  new RuntimeException("feign调用失败：getHelloWord");
    }

    @Override
    public String getHelloWordError() {
//        throw  new RuntimeException("feign调用失败：getHelloWordError");
        return "feign调用失败：getHelloWordError";
    }
}
