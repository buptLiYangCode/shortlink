package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dto.req.UserLoginReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterDTO;
import com.nageoffer.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserLoginRespDTO;
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
     */
    Boolean hasUserName(String username);
    /*
    注册用户
     */
    void register(UserRegisterDTO requestParam);
    /*

     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    Boolean loginCheck(String username, String token);

    void logout(String username, String token);
}
