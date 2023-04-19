package com.chenle.Consumer02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Consumer02MainApp {
    public static void main(String[] args) {
        SpringApplication.run(Consumer02MainApp.class,args);
    }
}
