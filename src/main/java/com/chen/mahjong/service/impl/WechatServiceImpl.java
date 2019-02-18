package com.chen.mahjong.service.impl;

import com.alibaba.fastjson.JSON;
import com.chen.mahjong.common.Response;
import com.chen.mahjong.configuration.WechatConfiguration;
import com.chen.mahjong.constant.WebConstants;
import com.chen.mahjong.dal.entity.User;
import com.chen.mahjong.domain.WechatLogin;
import com.chen.mahjong.service.IRoomService;
import com.chen.mahjong.service.IUserService;
import com.chen.mahjong.service.IWechatService;
import com.chen.mahjong.util.OkHttpUtils;
import com.chen.mahjong.util.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuChen
 * @create 2019-02-17-22:51
 */
@Slf4j
@Service
public class WechatServiceImpl implements IWechatService {

    @Resource
    private WechatConfiguration wechatConfiguration;

    @Resource
    private HttpServletRequest request;

    @Resource
    private IUserService userService;

    @Resource
    private IRoomService roomService;

    @Override
    public Response login(String code, String nickname) {
        String wechatUrl = wechatConfiguration.getWechatServerUrl();
        Map<String, Object> params = this.buildParams(code);
        try {
            String json = OkHttpUtils.get(wechatUrl, params);
            WechatLogin wechatLogin = JSON.parseObject(json, WechatLogin.class);
            String openid = wechatLogin.getOpenid();
            if (!StringUtils.isEmpty(openid)) {
                // 微信服务器登录成功，本地登陆
                Response response = userService.login(openid, nickname);
                if (response.isSuccess()) {
                    String sessionId = response.getString(WebConstants.SESSION_ID);
                    User user = response.get(WebConstants.USER, User.class);
                    Integer roomId = user.getRoomId();
                    boolean inRoom = roomId != null && roomId > 0;
                    return ResponseUtils.success().data(WebConstants.SESSION_ID, sessionId).data("inRoom", inRoom);
                }
                return ResponseUtils.fail().message("Local login fail");
            }
            return ResponseUtils.fail().message("Get user info from wechat server fail.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseUtils.fail().message("Get user info from wechat server fail.");
    }

    /**
     * build params
     * @param code code
     * @return map
     */
    private Map<String, Object> buildParams(String code) {
        String appId = wechatConfiguration.getAppId();
        String appSecret = wechatConfiguration.getAppSecret();
        String grantType = wechatConfiguration.getAppGrantType();
        Map<String, Object> params = new HashMap<>(16);
        params.put(WebConstants.APP_ID, appId);
        params.put(WebConstants.APP_SECRET, appSecret);
        params.put(WebConstants.JS_CODE, code);
        params.put(WebConstants.GRANT_TYPE, grantType);

        return params;
    }
}
