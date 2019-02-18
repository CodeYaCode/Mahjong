package com.chen.mahjong.domain;

import lombok.Data;

/**
 * @author LiuChen
 * @create 2019-02-18-22:28
 */
@Data
public class WechatLogin {

    /** session_key */
    private String sessionKey;

    /** openid */
    private String openid;
}
