package com.chen.mahjong.dal.mapper;

import com.chen.mahjong.dal.entity.Room;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoomMapper {

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    int insertSelective(Room record);

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    int updateByPrimaryKey(Room record);

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    int insert(Room record);

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    Room selectByPrimaryKey(Integer id);

    /**
     * 查询所有的房间
     * @return list
     */
    List<Room> selectAll();
}
