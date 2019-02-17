package com.chen.mahjong.service.impl;

import com.chen.mahjong.common.Response;
import com.chen.mahjong.configuration.WechatConfiguration;
import com.chen.mahjong.constant.WebConstants;
import com.chen.mahjong.service.IWechatService;
import com.chen.mahjong.util.OkHttpUtils;
import com.chen.mahjong.util.ResponseUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuChen
 * @create 2019-02-17-22:51
 */
@Service
public class WechatServiceImpl implements IWechatService {

    @Resource
    private WechatConfiguration wechatConfiguration;

    @Override
    public Response login(String code) {
        String wechatUrl = wechatConfiguration.getWechatServerUrl();
        String appId = wechatConfiguration.getAppId();
        String appSecret = wechatConfiguration.getAppSecret();
        String grantType = wechatConfiguration.getAppGrantType();
        Map<String, Object> params = new HashMap<>(16);
        params.put(WebConstants.APP_ID, appId);
        params.put(WebConstants.APP_SECRET, appSecret);
        params.put(WebConstants.JS_CODE, code);
        params.put(WebConstants.GRANT_TYPE, grantType);
        try {
            return ResponseUtils.success().data("user_info", OkHttpUtils.get(wechatUrl, params));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseUtils.fail();
    }
}
