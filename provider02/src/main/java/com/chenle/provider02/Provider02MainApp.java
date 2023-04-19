package com.chenle.provider02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Provider02MainApp {
    public static void main(String[] args) {
        SpringApplication.run(Provider02MainApp.class,args);
    }
}
