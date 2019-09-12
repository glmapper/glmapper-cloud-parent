package com.glmapper.bridge.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/9/11 11:37 PM
 * @since:
 **/
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AsyncRestTemplate asyncRestTemplate;

    @RequestMapping("/hello")
    public String hello(){
        return restTemplate.getForObject("http://HELLOGLMAPPERSERVICE/hello",String.class);
    }
}

