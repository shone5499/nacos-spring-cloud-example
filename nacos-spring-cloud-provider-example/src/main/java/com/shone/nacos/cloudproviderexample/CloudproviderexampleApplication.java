package com.shone.nacos.cloudproviderexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudproviderexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudproviderexampleApplication.class, args);
    }

}
