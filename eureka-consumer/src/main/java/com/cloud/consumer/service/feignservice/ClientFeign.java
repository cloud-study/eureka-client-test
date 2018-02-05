package com.cloud.consumer.service.feignservice;

import com.cloud.consumer.service.feignservice.impl.ClientFeignFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/24 17:22
 * @description
 */
@FeignClient(name = "eureka-client", fallback = ClientFeignFallback.class)
public interface ClientFeign {
    @GetMapping("/helloWord")
    String getHelloWord();

    @GetMapping("/getHelloWordError")
    String getHelloWordError();
}
