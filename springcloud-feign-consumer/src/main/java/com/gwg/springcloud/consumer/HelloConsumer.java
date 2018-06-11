package com.gwg.springcloud.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by
 */
@FeignClient(name = "service-provider")
public interface HelloConsumer {

    @RequestMapping(value = "/provider", method = RequestMethod.GET)
    String printServiceProvider();
}