package com.xiamoan.springcloud.server1;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Server2Client server2Client;

    @RequestMapping("test")
    @Hystrix
    public Object test(){
        return server2Client.test();
    }

}
