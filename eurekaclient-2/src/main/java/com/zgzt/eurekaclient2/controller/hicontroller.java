package com.zgzt.eurekaclient2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hicontroller {

    @RequestMapping("/hi")
    @ResponseBody
    public String sayHi(String name) {
        return "client——2"+"      ";
    }

    @RequestMapping("/test2/hi")
    @ResponseBody
    public String sayHi2(String name) {
        return "client——2"+"    /test2/hi  ";
    }

}
