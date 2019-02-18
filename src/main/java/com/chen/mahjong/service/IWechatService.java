package com.chen.mahjong.service;

import com.chen.mahjong.common.Response;

/**
 * @author LiuChen
 * @create 2019-02-17-22:50
 */
public interface IWechatService {

    /**
     * 登录微信服务器，拿到用户的 openId 等信息
     *
     * @param code     code
     * @param nickname nickname
     * @return response
     */
    Response login(String code, String nickname);
}
