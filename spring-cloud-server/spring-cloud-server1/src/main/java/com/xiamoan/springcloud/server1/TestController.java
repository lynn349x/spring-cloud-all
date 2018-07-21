package com.xiamoan.springcloud.server1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Server2Client server2Client;

    @RequestMapping("test")
    public Object test(){
        return server2Client.test();
    }

}
