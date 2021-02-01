package com.zgzt.feigndemo.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zgzt.feigndemo.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHiController {


    @Autowired
    private HiService hiService;

    @GetMapping("/sayHi")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "errorSayHi")
    public String sayHi() {
        return hiService.sayHi();
    }

    public String errorSayHi() {
        return "Error ——hystrixSayHi";
    }


}
