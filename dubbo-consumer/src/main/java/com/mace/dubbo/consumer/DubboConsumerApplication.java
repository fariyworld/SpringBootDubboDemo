package com.mace.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description:
 * <br />
 * Created by mace on 10:05 2018/6/29.
 */
@SpringBootApplication(scanBasePackages = {"com.mace.dubbo.consumer.controller"})
public class DubboConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
