package com.shone.nacos.cloudconsumerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiaoguojian
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudconsumerexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudconsumerexampleApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
