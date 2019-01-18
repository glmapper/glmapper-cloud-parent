package com.glmapper.bridge.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guolei.sgl (glmapper_2018@163.com) 19/1/15 下午11:13
 * @since:
 **/
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String hostname;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Glmapper! Now Port is "+port +" And hostname is " +hostname;
    }
}
