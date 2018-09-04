package com.gwg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 注解@EnableDiscoveryClient，@EnableEurekaClient的区别
 SpringCLoud中的“Discovery Service”有多种实现，比如：eureka, consul, zookeeper。
 1，@EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现；
 2，@EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用；
 如果你的classpath中添加了eureka，则它们的作用是一样的。


 因为我在classpath中添加了Eureka，所以在这里这两个注解的作用一样
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class);
    }
}