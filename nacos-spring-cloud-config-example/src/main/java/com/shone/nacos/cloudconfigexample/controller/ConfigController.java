package com.shone.nacos.cloudconfigexample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoClass
 *
 * @author Xiao GuoJian
 * @date 2020/7/31 下午5:45
 */

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${name}")
    private String name;

    @Value("${sex}")
    private String sex;

    @GetMapping("/get")
    public String get(){
        return name + "  " + sex;
    }

}
