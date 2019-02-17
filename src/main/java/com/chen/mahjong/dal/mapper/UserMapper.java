package com.chen.mahjong.dal.mapper;

import java.util.List;
import com.chen.mahjong.dal.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /**
     * @mbg.generated Sun Feb 17 17:06:33 CST 2019
     */
    User selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated Sun Feb 17 17:06:33 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated Sun Feb 17 17:06:33 CST 2019
     */
    int insertSelective(User record);

    /**
     * 根据 username 查询
     * @param username username
     * @return user
     */
    User selectByUsername(@Param("username") String username);

    /**
     * @mbg.generated Sun Feb 17 17:06:33 CST 2019
     */
    int updateByPrimaryKey(User record);

    /**
     * @mbg.generated Sun Feb 17 17:06:33 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 查询所有用户
     *
     * @return list user
     */
    List<User> selectAll();

    /**
     * @mbg.generated Sun Feb 17 17:06:33 CST 2019
     */
    int insert(User record);
}
