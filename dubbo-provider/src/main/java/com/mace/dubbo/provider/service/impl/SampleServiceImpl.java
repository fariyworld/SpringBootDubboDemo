package com.mace.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mace.dubbo.api.service.ISampleService;

/**
 * description:
 * <br />
 * Created by mace on 9:23 2018/6/29.
 */
@Service(//注意注解是 dubbo 的注解,不是 spring 的
        version = "1.0.0",
        application = "${dubbo.application.id}",//程序 id
        protocol = "${dubbo.protocol.id}",// dubbo 协议的 id
        registry = "${dubbo.registry.id}"// 注册中心的 id
)
public class SampleServiceImpl implements ISampleService {

    @Override
    public String sayHello(String name) {

        return "dubbo-provider-service-impl: " + name;
    }
}
