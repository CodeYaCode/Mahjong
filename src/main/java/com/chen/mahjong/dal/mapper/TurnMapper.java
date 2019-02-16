package com.chen.mahjong.dal.mapper;

import com.chen.mahjong.dal.entity.Turn;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TurnMapper {
    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    int insert(Turn record);

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    int insertSelective(Turn record);

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    Turn selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    int updateByPrimaryKeySelective(Turn record);

    /**
     *
     * @mbg.generated Sun Feb 17 00:41:06 CST 2019
     */
    int updateByPrimaryKey(Turn record);
}