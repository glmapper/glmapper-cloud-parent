package com.glmapper.bridge.boot.controller;

import com.glmapper.bridge.boot.service.HelloGlmapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guolei.sgl (glmapper_2018@163.com) 19/1/15 下午11:19
 * @since:
 **/
@RestController
public class FeignController {

    @Autowired
    private HelloGlmapperService helloGlmapperService;

    @RequestMapping("/hello")
    public String hello(){
        return helloGlmapperService.hello();
    }

}
