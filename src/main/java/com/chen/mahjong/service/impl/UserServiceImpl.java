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
    public Response login(String username) {
        User user = userMapper.selectByUsername(username);
        if (null == user) {
            return ResponseUtils.fail().message("用户不存在");
        }
        HttpSession session = request.getSession();
        session.setAttribute(WebConstants.SESSION_USER_NAME, username);
        user.setLast_login_time(new Date());
        userMapper.updateByPrimaryKeySelective(user);
        return ResponseUtils.success();
    }

    @Override
    public Response logout() {
        HttpSession session = request.getSession();
        if (null != session) {
            session.removeAttribute(WebConstants.SESSION_USER_NAME);
        }
        return ResponseUtils.success();
    }
}
