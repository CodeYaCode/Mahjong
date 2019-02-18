package com.chen.mahjong.service.impl;

import com.chen.mahjong.common.Response;
import com.chen.mahjong.constant.WebConstants;
import com.chen.mahjong.dal.entity.User;
import com.chen.mahjong.dal.mapper.UserMapper;
import com.chen.mahjong.service.IUserService;
import com.chen.mahjong.util.ResponseUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private HttpServletRequest request;

    @Override
    public Response create(String username) {
        if (null != userMapper.selectByUsername(username)) {
            return ResponseUtils.fail().message("用户名已经存在");
        }
        User user = new User();
        user.setUsername(username);
        user.setScore(0.0);
        userMapper.insert(user);

        return ResponseUtils.success();
    }

    @Override
    public Response listAll() {
        return ResponseUtils.success().data("users", userMapper.selectAll());
    }

    @Override
    public Response login(String openid, String nickname) {
        HttpSession session = request.getSession();
        String sessionId = session.getId();
        User user = userMapper.selectByOpenId(openid);
        if (null == user) {
            // 第一次登录的用户
            user = new User();
            user.setOpenid(openid);
            user.setUsername(nickname);
            user.setScore(0.0);
            user.setLastLoginTime(new Date());
            userMapper.insert(user);
        } else {
            // 更新一下用户名和最后登陆时间
            user.setUsername(nickname);
            user.setLastLoginTime(new Date());
            userMapper.updateByPrimaryKey(user);
        }
        session.setAttribute(WebConstants.USER_ID, user.getId());

        return ResponseUtils.success().data(WebConstants.SESSION_ID, sessionId).data(WebConstants.USER, user);
    }

    @Override
    public Response logout() {
        HttpSession session = request.getSession();
        if (null != session) {
            session.removeAttribute(WebConstants.USER_ID);
        }
        return ResponseUtils.success();
    }
}
