package com.shadow.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class Application9000 {
    public static void main(String[] args) {
        SpringApplication.run(Application9000.class,args);
    }
}
