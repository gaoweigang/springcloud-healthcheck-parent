package com.gwg.springcloud.service;

import com.gwg.springcloud.consumer.HelloConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Value("${name:unknown}")
    private String name;

    @Autowired
    private HelloConsumer helloConsumer;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 应用Consumer调用应用Provider的服务printServiceProvider
     * @return
     */
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("调用开始 start ****************");
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance.getServiceId() + " (" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + ")" + "===>name:" + name + "<br/>" + helloConsumer.printServiceProvider();
    }
}