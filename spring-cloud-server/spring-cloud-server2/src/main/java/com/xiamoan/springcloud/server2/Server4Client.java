package com.xiamoan.springcloud.server2;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("server4")
public interface Server4Client {

    @RequestMapping("test")
    Object test();
    
}
