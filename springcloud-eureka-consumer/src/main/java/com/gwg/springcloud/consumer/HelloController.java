package com.gwg.springcloud.consumer;

import com.gwg.springcloud.feign.service.HelloProvider;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private HelloProvider helloConsumer;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return helloConsumer.printServiceProvider();
    }
}