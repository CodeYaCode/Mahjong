package com.chen.mahjong.dal.mapper;

import java.util.List;
import com.chen.mahjong.dal.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /**
     * @mbg.generated Mon Feb 18 23:51:49 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 查询所有用户
     *
     * @return list user
     */
    List<User> selectAll();

    /**
     * @mbg.generated Mon Feb 18 23:51:49 CST 2019
     */
    int insert(User record);

    /**
     * @mbg.generated Mon Feb 18 23:51:49 CST 2019
     */
    int insertSelective(User record);

    /**
     * @mbg.generated Mon Feb 18 23:51:49 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated Mon Feb 18 23:51:49 CST 2019
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 根据 username 查询
     *
     * @param username username
     * @return user
     */
    User selectByUsername(@Param("username") String username);

    /**
     * 根据 openId 查询 User
     *
     * @param openid openid
     * @return user
     */
    User selectByOpenId(@Param("openid") String openid);

    /**
     * @mbg.generated Mon Feb 18 23:51:49 CST 2019
     */
    int updateByPrimaryKey(User record);
}
