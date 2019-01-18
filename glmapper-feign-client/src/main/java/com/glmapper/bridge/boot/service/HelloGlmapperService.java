package com.glmapper.bridge.boot.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: guolei.sgl (glmapper_2018@163.com) 19/1/15 下午11:18
 * @since:
 **/
@FeignClient("HelloGlmapperService")
public interface HelloGlmapperService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
