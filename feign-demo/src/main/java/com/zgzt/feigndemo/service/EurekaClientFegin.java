package com.zgzt.feigndemo.service;

import com.zgzt.feigndemo.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFegin {


    @GetMapping("/hi")
    public String sayHiFromclientEureka(@RequestParam(value = "name") String name);

}
