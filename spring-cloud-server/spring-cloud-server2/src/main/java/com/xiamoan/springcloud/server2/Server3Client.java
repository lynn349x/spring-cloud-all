package com.xiamoan.springcloud.server2;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("server3")
public interface Server3Client {

    @RequestMapping("test")
    String test();
    
}
