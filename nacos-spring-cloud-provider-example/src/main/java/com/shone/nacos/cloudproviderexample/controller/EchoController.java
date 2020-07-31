package com.shone.nacos.cloudproviderexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoClass
 *
 * @author Xiao GuoJian
 * @date 2020/7/31 下午6:27
 */

@RestController
@RequestMapping("/echo")
public class EchoController {

    @GetMapping("/getName")
    public String getName(@RequestParam String name){
        return "name="+name;
    }

}
