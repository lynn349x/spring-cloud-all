package com.xiamoan.springcloud.server2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Server3Client server3Client;
    @Autowired
    private Server4Client server4Client;

    @RequestMapping("test")
    public Object test(){

        String o3 = server3Client.test();
        Object o4 = server4Client.test();

        return o3.toString() + o4.toString();
    }

}
