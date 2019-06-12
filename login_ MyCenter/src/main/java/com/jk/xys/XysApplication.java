package com.jk.xys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class XysApplication {

    public static void main(String[] args) {
        SpringApplication.run(XysApplication.class, args);
    }

}
