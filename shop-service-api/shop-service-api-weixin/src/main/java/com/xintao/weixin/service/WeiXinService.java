package com.xintao.weixin.service;

import com.xintao.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface WeiXinService {

    @GetMapping("/getApp")
    public AppEntity getApp();
}
