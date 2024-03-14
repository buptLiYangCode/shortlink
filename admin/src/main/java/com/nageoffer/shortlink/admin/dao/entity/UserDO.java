package com.nageoffer.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.nageoffer.shortlink.admin.common.database.BaseDO;
import lombok.Data;

@Data
@TableName("t_user")
public class UserDO  extends BaseDO {
    @TableId(type = IdType.AUTO)
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



}
