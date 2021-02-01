package com.zgzt.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class TestController {


    @RequestMapping("/hi")
    @ResponseBody
    public String sayHi(){
        return "client——1";
    }
}
