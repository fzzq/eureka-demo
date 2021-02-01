package com.zgzt.eurekaserver2.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class TesplateRibbon {


    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        System.out.println("ribbon已加載");
        return new RestTemplate();
    }

}
