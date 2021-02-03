package com.zgzt.eurekaserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class ribbonController {


    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private LoadBalancerClient  loadBalanced;

//    @RequestMapping("/hi")
//    @ResponseBody
    public String sayHi(){
        String forObject = restTemplate.getForObject("http://eureka-client/hi", String.class);
        ServiceInstance serviceInstance = loadBalanced.choose("eureka-client");
        System.out.println("loadBalancerClient："+serviceInstance.getHost()+serviceInstance.getPort());
        return forObject;
    }
}
