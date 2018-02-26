package com.cloud.consumer.service.feignservice;

import com.cloud.consumer.service.feignservice.impl.ClientFeignFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/1/24 17:22
 * @description
 */
@FeignClient(name = "eureka-client", fallback = ClientFeignFallback.class)
public interface ClientFeign {
    @RequestMapping(value = "/api/eureka-client/helloWord", method = RequestMethod.GET)
    String getHelloWord();

    @RequestMapping("/api/eureka-client/getHelloWordError")
    String getHelloWordError();
}
