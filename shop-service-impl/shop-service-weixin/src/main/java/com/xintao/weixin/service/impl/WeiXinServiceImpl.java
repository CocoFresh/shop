package com.xintao.weixin.service.impl;

import com.xintao.entity.AppEntity;
import com.xintao.weixin.service.WeiXinService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xintao.feng
 * @Date: 2019/11/8 10:29
 * @Description:
 */
@RestController
public class WeiXinServiceImpl implements WeiXinService {
    @Override
    public AppEntity getApp() {
        return new AppEntity("123","xintao");
    }
}
