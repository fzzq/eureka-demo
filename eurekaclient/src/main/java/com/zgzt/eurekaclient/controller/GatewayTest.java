package com.zgzt.eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GatewayTest {

    @RequestMapping("/test2/test")
    @ResponseBody
    public String sayAAAAAAAAAA() {
        return "通过gateWay 访问成功" + "serivecID eurekaServer_2";
    }

    @RequestMapping("test")
    @ResponseBody
    public String sayAAAAAAAAsaybadcAA() {
        return "通过gateWay 访问成功" + "serivecID eurekaServer_2";
    }
}
