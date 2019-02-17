package com.chen.mahjong.dal.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 *
 * @author
 */
public class Room implements Serializable {

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private String northUsername;

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private Double eastScore;

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private Double southScore;

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private Integer id;

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private Double northScore;

    /**
     * 名字
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private String roomName;

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private String westUsername;

    /**
     * 创建时间
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private Date createTime;

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private String eastUsername;

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private String southUsername;

    /**
     * 持续时间
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private Double duration;

    /**
     * 一个花多少钱
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private Integer flower;

    /**
     * 更新时间
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private Date updateTime;

    /**
     * 创建人
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private String creator;

    /**
     * 状态
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private Integer status;

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private Double westScore;

    /**
     * 底
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    private Integer base;

    /**
     * This method sets the value of the database column mahjong..room.north_score
     *
     * @param northScore the value for mahjong..room.north_score
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setNorthScore(Double northScore) {
        this.northScore = northScore;
    }

    /**
     * This method returns the value of the database column mahjong..room.west_username
     *
     * @return the value of mahjong..room.west_username
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public String getWestUsername() {
        return westUsername;
    }

    /**
     * This method sets the value of the database column mahjong..room.base
     *
     * @param base the value for mahjong..room.base
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setBase(Integer base) {
        this.base = base;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.south_score
     *
     * @param southScore the value for mahjong..room.south_score
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setSouthScore(Double southScore) {
        this.southScore = southScore;
    }

    /**
     * This method returns the value of the database column mahjong..room.east_username
     *
     * @return the value of mahjong..room.east_username
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public String getEastUsername() {
        return eastUsername;
    }

    /**
     * This method sets the value of the database column mahjong..room.room_name
     *
     * @param roomName the value for mahjong..room.room_name
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * This method returns the value of the database column mahjong..room.south_username
     *
     * @return the value of mahjong..room.south_username
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public String getSouthUsername() {
        return southUsername;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withCreator(String creator) {
        this.setCreator(creator);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.east_score
     *
     * @param eastScore the value for mahjong..room.east_score
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setEastScore(Double eastScore) {
        this.eastScore = eastScore;
    }

    /**
     * This method sets the value of the database column mahjong..room.west_score
     *
     * @param westScore the value for mahjong..room.west_score
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setWestScore(Double westScore) {
        this.westScore = westScore;
    }

    /**
     * This method sets the value of the database column mahjong..room.south_username
     *
     * @param southUsername the value for mahjong..room.south_username
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setSouthUsername(String southUsername) {
        this.southUsername = southUsername;
    }

    /**
     * This method sets the value of the database column mahjong..room.id
     *
     * @param id the value for mahjong..room.id
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method sets the value of the database column mahjong..room.flower
     *
     * @param flower the value for mahjong..room.flower
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setFlower(Integer flower) {
        this.flower = flower;
    }

    /**
     * This method returns the value of the database column mahjong..room.id
     *
     * @return the value of mahjong..room.id
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method returns the value of the database column mahjong..room.create_time
     *
     * @return the value of mahjong..room.create_time
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method returns the value of the database column mahjong..room.flower
     *
     * @return the value of mahjong..room.flower
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Integer getFlower() {
        return flower;
    }

    /**
     * This method returns the value of the database column mahjong..room.room_name
     *
     * @return the value of mahjong..room.room_name
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * This method returns the value of the database column mahjong..room.south_score
     *
     * @return the value of mahjong..room.south_score
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Double getSouthScore() {
        return southScore;
    }

    /**
     * This method returns the value of the database column mahjong..room.west_score
     *
     * @return the value of mahjong..room.west_score
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Double getWestScore() {
        return westScore;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withEastUsername(String eastUsername) {
        this.setEastUsername(eastUsername);
        return this;
    }

    /**
     * This method returns the value of the database column mahjong..room.status
     *
     * @return the value of mahjong..room.status
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column mahjong..room.update_time
     *
     * @param updateTime the value for mahjong..room.update_time
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withStatus(Integer status) {
        this.setStatus(status);
        return this;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withBase(Integer base) {
        this.setBase(base);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.east_username
     *
     * @param eastUsername the value for mahjong..room.east_username
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setEastUsername(String eastUsername) {
        this.eastUsername = eastUsername;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withSouthUsername(String southUsername) {
        this.setSouthUsername(southUsername);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.creator
     *
     * @param creator the value for mahjong..room.creator
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * This method returns the value of the database column mahjong..room.base
     *
     * @return the value of mahjong..room.base
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Integer getBase() {
        return base;
    }

    /**
     * This method returns the value of the database column mahjong..room.east_score
     *
     * @return the value of mahjong..room.east_score
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Double getEastScore() {
        return eastScore;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withEastScore(Double eastScore) {
        this.setEastScore(eastScore);
        return this;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withDuration(Double duration) {
        this.setDuration(duration);
        return this;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withWestScore(Double westScore) {
        this.setWestScore(westScore);
        return this;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withWestUsername(String westUsername) {
        this.setWestUsername(westUsername);
        return this;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withNorthScore(Double northScore) {
        this.setNorthScore(northScore);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.north_username
     *
     * @param northUsername the value for mahjong..room.north_username
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setNorthUsername(String northUsername) {
        this.northUsername = northUsername;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withSouthScore(Double southScore) {
        this.setSouthScore(southScore);
        return this;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method returns the value of the database column mahjong..room.duration
     *
     * @return the value of mahjong..room.duration
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * This method sets the value of the database column mahjong..room.west_username
     *
     * @param westUsername the value for mahjong..room.west_username
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setWestUsername(String westUsername) {
        this.westUsername = westUsername;
    }

    /**
     * This method sets the value of the database column mahjong..room.status
     *
     * @param status the value for mahjong..room.status
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roomName=").append(roomName);
        sb.append(", status=").append(status);
        sb.append(", base=").append(base);
        sb.append(", flower=").append(flower);
        sb.append(", eastUsername=").append(eastUsername);
        sb.append(", southUsername=").append(southUsername);
        sb.append(", westUsername=").append(westUsername);
        sb.append(", northUsername=").append(northUsername);
        sb.append(", eastScore=").append(eastScore);
        sb.append(", southScore=").append(southScore);
        sb.append(", westScore=").append(westScore);
        sb.append(", northScore=").append(northScore);
        sb.append(", creator=").append(creator);
        sb.append(", duration=").append(duration);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withRoomName(String roomName) {
        this.setRoomName(roomName);
        return this;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withFlower(Integer flower) {
        this.setFlower(flower);
        return this;
    }

    /**
     * This method returns the value of the database column mahjong..room.update_time
     *
     * @return the value of mahjong..room.update_time
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method sets the value of the database column mahjong..room.duration
     *
     * @param duration the value for mahjong..room.duration
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * This method returns the value of the database column mahjong..room.creator
     *
     * @return the value of mahjong..room.creator
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method returns the value of the database column mahjong..room.north_username
     *
     * @return the value of mahjong..room.north_username
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public String getNorthUsername() {
        return northUsername;
    }

    /**
     * This method returns the value of the database column mahjong..room.north_score
     *
     * @return the value of mahjong..room.north_score
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Double getNorthScore() {
        return northScore;
    }

    /**
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public Room withNorthUsername(String northUsername) {
        this.setNorthUsername(northUsername);
        return this;
    }

    /**
     * This method sets the value of the database column mahjong..room.create_time
     *
     * @param createTime the value for mahjong..room.create_time
     *
     * @mbg.generated Sun Feb 17 17:06:55 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
