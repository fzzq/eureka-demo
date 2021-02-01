package com.zgzt.feigndemo.service;

import com.zgzt.feigndemo.service.EurekaClientFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {

    @Autowired
    private EurekaClientFegin eurekaClientFegin;

    public  String sayHi(){
        return eurekaClientFegin.sayHiFromclientEureka("通过feignClientdi调用");
    }
}
