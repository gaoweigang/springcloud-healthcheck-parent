package com.gwg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心
 */
@EnableEurekaServer //启动服务注册中心
@SpringBootApplication
public class EurekaRegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRegisterApplication.class, args);
    }
}
