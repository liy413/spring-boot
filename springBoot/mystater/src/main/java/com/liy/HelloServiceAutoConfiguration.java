package com.liy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {
    @Autowired
    HelloProperties hp;

    @Bean
    public HelloService helloService(){
        HelloService service = new HelloService();
        service.setSay(hp.getSay());
        service.setName(hp.getName());
        return service;
    }
}

