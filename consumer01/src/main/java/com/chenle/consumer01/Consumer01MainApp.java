package com.chenle.consumer01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.chenle.consumer01"})
public class Consumer01MainApp {
    public static void main(String[] args) {
        SpringApplication.run(Consumer01MainApp.class,args);
    }
}
