package com.chen.mahjong.dal.mapper;

import java.util.List;
import com.chen.mahjong.dal.entity.Room;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoomMapper {

    /**
     * @mbg.generated Mon Feb 18 23:49:50 CST 2019
     */
    int insertSelective(Room record);

    /**
     * @mbg.generated Mon Feb 18 23:49:50 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated Mon Feb 18 23:49:50 CST 2019
     */
    int updateByPrimaryKey(Room record);

    /**
     * @mbg.generated Mon Feb 18 23:49:50 CST 2019
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     * 查询所有的房间
     * @return list
     */
    List<Room> selectAll();

    /**
     * @mbg.generated Mon Feb 18 23:49:50 CST 2019
     */
    int insert(Room record);

    /**
     * @mbg.generated Mon Feb 18 23:49:50 CST 2019
     */
    Room selectByPrimaryKey(Integer id);
}
