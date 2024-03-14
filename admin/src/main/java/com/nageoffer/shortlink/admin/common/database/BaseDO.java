package com.nageoffer.shortlink.admin.common.database;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

/**
 * 数据库持久层对象基础属性
 */
@Data
public class BaseDO {

    @TableField( fill = FieldFill.INSERT)
    // 创建时间
    private Date createTime;
    @TableField( fill = FieldFill.INSERT_UPDATE)
    // 更新时间
    private Date updateTime;
    @TableField( fill = FieldFill.INSERT)
    // 删除标记（0代表未删除，1代表已删除）
    private Integer delFlag;
}
