package com.glmapper.bridge.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/9/11 11:35 PM
 * @since:
 **/
@SpringBootApplication
@EnableEurekaClient
public class SofaEurekaConsumerRibbonApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    @LoadBalanced
    public AsyncRestTemplate asyncRestTemplate(){
        return new AsyncRestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SofaEurekaConsumerRibbonApplication.class, args);
    }
}
