package com.gwg.springcloud.feign.service;

import feign.Headers;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 从服务注册中心获取服务
 */
@FeignClient(name = "service-provider", url = "http://localhost:8765")//name服务名称，url是提供服务的服务地址
public interface HelloProvider {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    String printServiceProvider();
}