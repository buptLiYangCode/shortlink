package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.GroupDO;

public interface GroupService extends IService<GroupDO> {

    //新增短链接分组名
    void saveGroup(String groupName);
}
