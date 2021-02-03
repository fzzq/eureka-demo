package com.zgzt.getwaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GetwayDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetwayDemoApplication.class, args);
    }

}
