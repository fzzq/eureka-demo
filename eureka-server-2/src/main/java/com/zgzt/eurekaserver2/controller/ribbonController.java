package com.zgzt.eurekaserver2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class ribbonController {


    @Autowired
    private RestTemplate restTemplate;




    @RequestMapping("/hi")
    @ResponseBody
    public String sayHi(){
        String forObject = restTemplate.getForObject("http://eureka-client/hi", String.class);
        return forObject;
    }

}
