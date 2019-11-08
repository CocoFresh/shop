package com.xintao.member.service;


import com.xintao.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface MemberService {

    @GetMapping("/memberToWeiXin")
    public AppEntity memberToWeiXin();
}
