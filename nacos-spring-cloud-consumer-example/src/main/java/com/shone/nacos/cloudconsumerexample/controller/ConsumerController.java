package com.shone.nacos.cloudconsumerexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * DemoClass
 *
 * @author Xiao GuoJian
 * @date 2020/7/31 下午6:34
 */

@RequestMapping("/consumer")
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getName")
    public String getName(@RequestParam String name){
        String result = restTemplate.getForObject("http://service-provider/echo/getName?name=" + name, String.class);
        return "consumer: "+result;
    }

}
