package com.zgzt.feigndemo.service;

import com.zgzt.feigndemo.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 在接口上加＠FeignClient 注解来声明一个Feign Client,其中value 为远程调用其他服务的服务名， FeignConfig.class 为Feign Client 的配置类
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFegin {


    /**
     * 在EurekaClientFeign 接口内部有一个sayHiFromClientEureka（）方法，该方法通过Feign 来调用eureka-client 服务的“/hi”的API 接口
     * @param name
     * @return
     */
    @GetMapping("/hi")
    public String sayHiFromclientEureka(@RequestParam(value = "name") String name);

}
