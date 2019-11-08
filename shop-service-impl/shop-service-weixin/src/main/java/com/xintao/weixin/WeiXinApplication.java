package com.xintao.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: xintao.feng
 * @Date: 2019/11/8 11:36
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class WeiXinApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeiXinApplication.class, args);
    }
}
