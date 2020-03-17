package com.ximouzhao.testsomething;

import lombok.Data;

@Data
public class RedisUserInfoModel {
    // 用户ID
    private String user_id;
    // 用户名称
    private String user_name;
    // 手机号
    private String mobile;
    // 邮箱
    private String email;
    // 组织id
    private String org_id;
}
