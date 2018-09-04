package com.gwg.springcloud.consumer;

import com.gwg.springcloud.feign.service.HelloProvider;
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
    private HelloProvider helloConsumer;


    /**
     * 应用Consumer调用应用Provider的服务printServiceProvider
     * @return
     */
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("调用开始 start ****************");
        return "===>name:" + name + "<br/>" + helloConsumer.printServiceProvider();
    }
}