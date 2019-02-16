package com.chen.mahjong.dal.mapper;

import com.chen.mahjong.dal.entity.Room;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoomMapper {
    /**
     *
     * @mbg.generated Sun Feb 17 02:47:10 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sun Feb 17 02:47:10 CST 2019
     */
    int insert(Room record);

    /**
     *
     * @mbg.generated Sun Feb 17 02:47:10 CST 2019
     */
    int insertSelective(Room record);

    /**
     *
     * @mbg.generated Sun Feb 17 02:47:10 CST 2019
     */
    Room selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sun Feb 17 02:47:10 CST 2019
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     *
     * @mbg.generated Sun Feb 17 02:47:10 CST 2019
     */
    int updateByPrimaryKey(Room record);
}