package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;

public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    UserRespDTO getUserByUserName(String username);

    /**
     * 查询用户名是否存在
     *
     * @param username
     * @return
     */
    Boolean hasUserName(String username);
    /*
    注册用户
     */
    void register(UserRegisterDTO requestParam);
}
