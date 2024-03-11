package com.nageoffer.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_user")
public class UserDO {
    // 用户ID
    private Long id;

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

    // 删除时间
    private Long deletionTime;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;

    // 删除标记（0代表未删除，1代表已删除）
    private Integer delFlag;

}
