package com.nageoffer.shortlink.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.nageoffer.shortlink.admin.common.convention.result.Result;
import com.nageoffer.shortlink.admin.common.convention.result.Results;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserActualRespDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/*
 *
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUserName(@PathVariable("username") String username) {

        return Results.success(userService.getUserByUserName(username));
    }
    @GetMapping("/api/shortlink/v1/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUserName(@PathVariable("username") String username) {

        return Results.success(BeanUtil.toBean(userService.getUserByUserName(username), UserActualRespDTO.class));
    }

    /**
     * 查询用户名是否可用
     * @param username
     * @return
     */
    @GetMapping("/api/shortlink/v1/user/has-username")
    public Result<Boolean> hasUserName(@RequestParam("username") String username) {
        return Results.success(userService.hasUserName(username));
    }

    /**
     * 注册用户
     */
    @PostMapping("/api/shortlink/v1/user")
    public Result<Void> register(@RequestBody UserRegisterDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }
}
