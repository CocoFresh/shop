package com.xintao.member.service.impl;

import com.xintao.entity.AppEntity;
import com.xintao.member.feign.WeiXinServiceFeign;
import com.xintao.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xintao.feng
 * @Date: 2019/11/8 13:34
 * @Description:
 */
@RestController
public class MemberServiceImpl implements MemberService {
    @Autowired
    private WeiXinServiceFeign weiXinServiceFeign;

    @Override
    public AppEntity memberToWeiXin() {
        return weiXinServiceFeign.getApp();
    }
}
