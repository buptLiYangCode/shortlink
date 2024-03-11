package com.nageoffer.shortlink.admin.dto.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nageoffer.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;
import lombok.Data;

/*
用户返回参数响应
 */
@Data
public class UserRespDTO {
    // 用户ID
    private Long id;

    // 用户名
    private String username;

    // 真实姓名
    private String realName;

    // 手机号码
    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;

    // 邮箱地址
    private String mail;
}
