package com.gwg.springcloud.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在SpringCloud Eureka中，Restful接口 作为服务的提供者
 */
@RestController
public class HelloProvider {

    @Autowired
    DiscoveryClient discoveryClient;

    @Value("${msg:unknown}")
    private String msg;

    @RequestMapping(value = "/provider", method = RequestMethod.GET)
    public String printServiceProvider() {
        System.out.println("调用服务开始 start ..........");
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance.getServiceId() + " (" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + ")" + "===>Say " + msg;
    }
}