package com.mace.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mace.dubbo.api.service.ISampleService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * <br />
 * Created by mace on 10:12 2018/6/29.
 */
@RestController
@RequestMapping("/sample")
public class SampleController {

    @Reference(
            version = "1.0.0",
            application = "${dubbo.application.id}"
    )
    private ISampleService iSampleService;


    @RequestMapping(value = "sayHello.do/{name}")
    public String sayHello(@PathVariable String name){

        return iSampleService.sayHello(name);
    }
}
