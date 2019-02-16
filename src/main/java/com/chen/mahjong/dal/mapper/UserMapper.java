package com.chen.mahjong.dal.mapper;

import com.chen.mahjong.dal.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     *
     * @mbg.generated Sun Feb 17 00:41:08 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:08 CST 2019
     */
    int insert(User record);

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:08 CST 2019
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:08 CST 2019
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:08 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:08 CST 2019
     */
    int updateByPrimaryKey(User record);
}