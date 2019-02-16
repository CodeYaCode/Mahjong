package com.chen.mahjong.service;

import com.chen.mahjong.common.Response;

/**
 * @author LiuChen
 * @create 2019-02-17-1:35
 */
public interface IUserService {

    /**
     * 创建新用户
     *
     * @param username username
     * @return response
     */
    Response create(String username);

    /**
     * 展示所有用户
     *
     * @return response
     */
    Response listAll();

    /**
     * 登录
     *
     * @param username username
     * @return response
     */
    Response login(String username);

    /**
     * 登出
     * @return response
     */
    Response logout();
}
