package com.xiamoan.springcloud.server3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Server2Client server2Client;
    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("test")
    public Object test(){
        return "spring.application.name: " + name;
//        return server2Client.test();
    }

}
