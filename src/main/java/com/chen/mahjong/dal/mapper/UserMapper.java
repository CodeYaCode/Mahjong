package com.chen.mahjong.dal.mapper;

import com.chen.mahjong.dal.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    int insert(User record);

    /**
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    int insertSelective(User record);

    /**
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    User selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * @mbg.generated Sun Feb 17 01:44:55 CST 2019
     */
    int updateByPrimaryKey(User record);

    /**
     * 查询所有用户
     *
     * @return list user
     */
    List<User> selectAll();

    /**
     * 根据 username 查询
     * @param username username
     * @return user
     */
    User selectByUsername(@Param("username") String username);
}