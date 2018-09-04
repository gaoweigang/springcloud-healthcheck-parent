package com.gwg.springcloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 从服务注册中心获取服务
 */
@FeignClient(name = "service-provider")
public interface HelloProvider {

    @RequestMapping(value = "/provider", method = RequestMethod.GET)
    String printServiceProvider();
}