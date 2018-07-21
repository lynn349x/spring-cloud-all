package com.xiamoan.springcloud.server4;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("server2")
public interface Server2Client {

    @RequestMapping("test")
    Object test();

}
