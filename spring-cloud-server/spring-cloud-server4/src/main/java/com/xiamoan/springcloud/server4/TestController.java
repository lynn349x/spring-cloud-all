package com.xiamoan.springcloud.server4;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class TestController {

    @Autowired
    private Server2Client server2Client;
    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("test")
//    @ResponseBody
    public Object test(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("q", 66666);
        jsonObject.put("spring.application.name", name);

//        死循环调用
//        jsonObject.put("lian", server2Client.test().toString());
        return jsonObject;
//        return "spring.application.name: " + name;
//        return server2Client.test();
    }

}
