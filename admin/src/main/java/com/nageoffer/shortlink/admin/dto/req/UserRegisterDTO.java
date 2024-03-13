package com.nageoffer.shortlink.admin.dto.req;


import lombok.Data;

@Data
public class UserRegisterDTO {

    // 用户名
    private String username;

    // 密码
    private String password;

    // 真实姓名
    private String realName;

    // 手机号码
    private String phone;

    // 邮箱地址
    private String mail;
}
