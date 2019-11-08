package com.xintao.entity;

import lombok.Data;

/**
 * @Auther: xintao.feng
 * @Date: 2019/11/8 10:05
 * @Description:
 */
@Data
public class AppEntity {

    private String appId;

    private String appName;

    public AppEntity(String appId, String appName) {
        super();
        this.appId = appId;
        this.appName = appName;
    }
}
