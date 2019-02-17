package com.chen.mahjong.dal.mapper;

import com.chen.mahjong.dal.entity.Meta;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MetaMapper {
    /**
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    int insert(Meta record);

    /**
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    int insertSelective(Meta record);

    /**
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    Meta selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    int updateByPrimaryKeySelective(Meta record);

    /**
     *
     * @mbg.generated Sun Feb 17 23:39:57 CST 2019
     */
    int updateByPrimaryKey(Meta record);

    List<Meta> selectAll();
}