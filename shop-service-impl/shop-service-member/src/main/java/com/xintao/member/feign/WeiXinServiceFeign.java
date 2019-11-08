package com.xintao.member.feign;

import com.xintao.weixin.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Auther: xintao.feng
 * @Date: 2019/11/8 13:44
 * @Description:
 */
@FeignClient("app-xintao-weixin")
public interface WeiXinServiceFeign extends WeiXinService {
//    @GetMapping("/getApp")
//    public AppEntity getApp();
}
