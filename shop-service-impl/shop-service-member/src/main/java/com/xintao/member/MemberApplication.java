package com.xintao.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: xintao.feng
 * @Date: 2019/11/8 13:48
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
