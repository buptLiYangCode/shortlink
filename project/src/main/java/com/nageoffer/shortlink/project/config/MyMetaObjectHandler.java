package com.nageoffer.shortlink.project.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "createTime", Date::new, Date.class); // 起始版本 3.3.3(推荐)
        this.strictInsertFill(metaObject, "updateTime", Date::new, Date.class); // 起始版本 3.3.3(推荐)
        this.strictInsertFill(metaObject, "delFlag", ()-> 0, Integer.class); // 起始版本 3.3.3(推荐)
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "updateTime", Date::new, Date.class); // 起始版本 3.3.3(推荐)
    }
}
