package com.chen.mahjong.test.mapper;

import com.chen.mahjong.dal.entity.User;
import com.chen.mahjong.dal.mapper.UserMapper;
import com.chen.mahjong.test.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

public class UserMapperTest extends BaseTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void select() {
        User user = userMapper.selectByPrimaryKey(1);
        System.err.println(user);
    }
}
